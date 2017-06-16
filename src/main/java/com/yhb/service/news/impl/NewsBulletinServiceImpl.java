package com.yhb.service.news.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.bean.entity.ArticleDetail;
import com.yhb.bean.entity.ArticleDetailExample;
import com.yhb.bean.entity.ArticleDetailExample.Criteria;
import com.yhb.dao.ArticleDetailDao;
import com.yhb.enums.CommonTypeEnums;
import com.yhb.service.news.NewsBulletinService;
import com.yhb.util.DateUtils;

/**
 * 
* @ClassName: NewsBulletinService.java
* @Description: 新闻公告同意接口
*
* @version: v1.0.0
* @author: wangxf
* @date: 2017年5月10日 下午1:02:04 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月10日     wangxf           v1.0.0               修改原因
 */
@Service
@Transactional
public class NewsBulletinServiceImpl implements NewsBulletinService{
	
	@Autowired
	ArticleDetailDao articleDetailDao;
	
	private ArticleDetailExample example = null;

	/**
	 * 
	* @Function: NewsBulletinServiceImpl.java
	* @Description: 根据类型获取相应的数据信息， 1:新闻、2：公告、3：温馨提示
	*
	* @param: Byte newsType 文章类型: 1,新闻;2,公告;3.温馨提示
	* @param: Integer state 文章类型状态: 1：未删除   0：已删除
	* @param: String condition 查询的额外条件 （可以为空）
	* @return： List<ArticleDetail>
	* @throws： 
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月10日 下午12:52:55 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月10日     wangxf           v1.0.0               修改原因
	 */
	public List<ArticleDetail> getNewsBulletinsInfo(Byte newsType, Integer state, String condition){
		
		example = new ArticleDetailExample();
		
		Criteria criteria = example.createCriteria();
		// 文章类型
		if( null != newsType && newsType != 0 ){
			criteria.andTypeEqualTo(newsType);
		}
		// 是否删除
		if( null != state ){
			criteria.andEmp1EqualTo(state);
		}
		
		// 默认以发布时间从大到小排序
		if( StringUtils.isNotBlank(condition) ){
			example.setOrderByClause(condition);
		}
		
		return articleDetailDao.selectByExample(example);
	}
	
	/**
	 * 
	* @Function: NewsBulletinController.java
	* @Description: 为首页新闻列表信息获取生成出参:8 条数据
	*
	* @param: 
	* @return： 
	* @throws： 
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月10日 下午3:37:26 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月10日     wangxf           v1.0.0               修改原因
	 */
	public Map<String, List<Map<String, Object>>> createReturnMap( List<ArticleDetail> articleDetailList ){
		
		if( null == articleDetailList || articleDetailList.size() < 1 ){
			return null;
		}
		
		Map<String, List<Map<String, Object>>> returnList = new HashMap<String, List<Map<String, Object>>>();
				
		// 新闻列表
		List<Map<String, Object>> newsList = new ArrayList<Map<String, Object>>();
		// 新闻信息集合
		Map<String, Object> newsMap = null;
		ArticleDetail articleDetail = null;
		
		for( int i=0 ; i < articleDetailList.size() ; i++ ){
			
			newsMap = new HashMap<String, Object>();
			articleDetail = articleDetailList.get(i);
			// 是内联 in 外联 out
			String type = CommonTypeEnums.NEWS_TYPE_IN.getCodeValue();
			
			// 判断是否为视频类新闻   
			if( StringUtils.isNotBlank( articleDetail.getVideoAddress() ) ){
				type = CommonTypeEnums.NEWS_TYPE_OUT.getCodeValue();
			} 
			
			if( articleDetailList.size() - i == 2 ){
				// 文字新闻
				returnList.put("textList", newsList);
				newsList = new ArrayList<Map<String, Object>>();
			}
			
			// 获取时间
			String time = DateUtils.getDateMonth(articleDetail.getCreateTime())
						  + "."
						  + DateUtils.getDateDay(articleDetail.getCreateTime());
			newsMap.put("type", type);
			newsMap.put("id", articleDetail.getId());
			newsMap.put("img", StringUtils.isBlank(articleDetail.getImgAddress()) ? "" : articleDetail.getImgAddress());
			newsMap.put("title", StringUtils.isBlank(articleDetail.getTitle()) ? "" : articleDetail.getTitle());
			newsMap.put("link", StringUtils.isBlank(articleDetail.getVideoAddress()) ? "" : articleDetail.getVideoAddress());
			newsMap.put("time", time);
			
			newsList.add(newsMap);
		}
		
		// 图片新闻
		returnList.put("picList", newsList);
		
		return returnList;
	}
}
