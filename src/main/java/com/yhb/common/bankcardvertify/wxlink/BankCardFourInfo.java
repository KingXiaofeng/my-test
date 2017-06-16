package com.yhb.common.bankcardvertify.wxlink;

/**
 * 银行卡四要素
 * @author Administrator
 *
 */
public class BankCardFourInfo {

	private String CARD_ID;    //银行卡号
	private String CERT_ID;    //身份证号
	private String CERT_NAME;  //姓名
	private String MP;         //手机号
	private String PROD_ID;    // 产品代号
	public String getCARD_ID() {
		return CARD_ID;
	}
	public void setCARD_ID(String cARD_ID) {
		CARD_ID = cARD_ID;
	}
	public String getCERT_ID() {
		return CERT_ID;
	}
	public void setCERT_ID(String cERT_ID) {
		CERT_ID = cERT_ID;
	}
	public String getCERT_NAME() {
		return CERT_NAME;
	}
	public void setCERT_NAME(String cERT_NAME) {
		CERT_NAME = cERT_NAME;
	}
	public String getMP() {
		return MP;
	}
	public void setMP(String mP) {
		MP = mP;
	}
	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	
	
	
}
