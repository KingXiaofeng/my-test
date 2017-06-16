package com.yhb.util.bank;

import com.alibaba.fastjson.JSONObject;
import com.yhb.base.BaseConstants;
import com.yhb.common.bankcardvertify.api.DefaultApi;
import com.yhb.common.bankcardvertify.wxlink.BankCardResponseData;
import com.yhb.enums.ResultEnum;
import com.yhb.util.StringUtil;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Function: AccountsUsersCenterController.java
 * @Description: 银行四要素验证接口
 * @version: v1.0.0
 * @author: wangxf
 * @date: 2017年5月13日 下午3:33:53
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2017年5月13日     wangxf           v1.0.0               修改原因
 */
public class BankCardValidationUtil {

    private final static Logger LOG = LoggerFactory.getLogger(BankCardValidationUtil.class);
    /**
     *
     * @Function: BankCardValidationUtil.java
     * @Description: 银行四要素验证，idCard：身份证号，trueName：真实姓名，cardId：银行卡号，telPhone:预留手机号
     *
     * @param: idCard：身份证号，trueName：真实姓名，cardId：银行卡号，telPhone:预留手机号
     * @return：Integer
     * @throws：ApiException
     *
     * @version: v1.0.0
     * @author: wangxf
     * @date: 2017年5月13日 下午3:33:53
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2017年5月13日     wangxf           v1.0.0               修改原因
     */
    public static Map<String,Object> bankCardVerifyByFourFactors(String idCard, String trueName, String cardId, String telPhone) throws Exception {

        Map<String, Object> returnMap = new HashMap<>();

        // 判断四要素信息是否为空
        if ( StringUtil.isBlank(idCard) && StringUtil.isBlank(trueName) && StringUtil.isBlank(cardId) && StringUtil.isBlank(telPhone)) {
            returnMap.put("code", ResultEnum.FOUR_FACTORS_ISNULL.getCode());
            returnMap.put("msg", ResultEnum.FOUR_FACTORS_ISNULL.getCodeDesc());
            return returnMap;
        }

        // 调用四要素接口
        DefaultApi defaultApi = new DefaultApi();
        // 传入四要素
        String transferResult = defaultApi.cardFourTransfer(idCard, trueName, cardId, telPhone, BaseConstants.appKey);

        if ( StringUtil.isBlank(transferResult) ) {
            LOG.info("调用京东四要素认证接口失败！！！");
            returnMap.put("code", ResultEnum.BANKCARD_CHECK_CALLAPI_FAIL.getCode());
            returnMap.put("msg", ResultEnum.BANKCARD_CHECK_CALLAPI_FAIL.getCodeDesc());
            return returnMap;
        }

        JSONObject jsonObject = JSONObject.parseObject(transferResult);

        // 京东万象平台系统返回码（1000 查询成功）
        if ( BaseConstants.SYSCODE.equals(jsonObject.getString("code")) ) {
            // 获取xml文件
            String verifyResultJD = jsonObject.getString("result");
            // 解析xml文件
            BankCardResponseData data = getResponseData(verifyResultJD);

            returnMap.put("code", data.getRespCode());
            returnMap.put("msg", data.getRespDesc());
        } else {
            returnMap.put("code", jsonObject.getString("code"));
            String msg = jsonObject.getString("msg");
            if ("10010".equals(jsonObject.getString("code"))) {
                msg = "系统繁忙，请联系客服";
            }
            returnMap.put("msg", msg);

            LOG.error("请求京东万象银行卡四要素接口返回错误码" + jsonObject.getString("code") + "  " + jsonObject.getString("msg"));
        }

        return returnMap;
    }

    /**
     *
     * @Function: BankCardValidationUtil.java
     * @Description: 解析京东四要素认证接口返回的xml
     * @param: verifyResultJD
     * @return： BankCardResponseData
     * @throws：
     *
     * @version: v1.0.0
     * @author: wangxf
     * @date: 2017年5月13日 下午3:33:53
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2017年5月13日     wangxf           v1.0.0               修改原因
     */
    public static BankCardResponseData getResponseData(String verifyResultJD) throws Exception {
        if (StringUtil.isBlank(verifyResultJD)) {
            return null;
        }

        // 解析XML形式的文本,得到document对象
        Document document = DocumentHelper.parseText(verifyResultJD);
        // 获取文档的根节点
        Element rootElement = document.getRootElement();

        Class<BankCardResponseData> clazz = BankCardResponseData.class;

        BankCardResponseData data = clazz.newInstance();

        // 获取BankCardResponseData的所有属性
        Field[] fs = clazz.getDeclaredFields();

        for (Field field : fs) {
            // 获取属性名称
            String fieldName = field.getName();
            // 获取属性值
            String fieldValue = rootElement.element(fieldName).getText();
            // 设置private可访问
            field.setAccessible(true);
            // 设置对象属性的值
            field.set(data, fieldValue);
        }
        return data;
    }

}
