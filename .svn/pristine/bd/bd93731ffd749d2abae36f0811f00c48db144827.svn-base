package com.yhb.service.news;

import java.util.List;
import java.util.Map;

import com.yhb.bean.entity.ArticleDetail;

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
public interface NewsBulletinService {

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
	public List<ArticleDetail> getNewsBulletinsInfo(Byte newsType, Integer state, String condition);
	
	/**
	 * 
	* @Function: NewsBulletinController.java
	* @Description: 为首页新闻列表信息获取生成出参:8 条数据
	*
	* @param: List<ArticleDetail> articleDetailList
	* @return： Map<String, List<Map<String, Object>>>
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
	public Map<String, List<Map<String, Object>>> createReturnMap( List<ArticleDetail> articleDetailList );
}