package com.yhb.common.bankcardvertify.wxlink;

public class BankCardResponseData {

	private String versionId;   //版本号
	
	private String custId;      //商户号
	
	private String ordId;      //订单号
	
	private String transType;   //产品类型
	 
	private String merPriv;    //用户保留域
	
	private String respCode;   //返回码
	  
	private String respDesc;   //返回描述
	
	private String resTxnId;   // 返回流水号
	
	private String macStr;     // 返回校验值
	
	private String jsonStr;    // 返回用户信息

	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getOrdId() {
		return ordId;
	}

	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getMerPriv() {
		return merPriv;
	}

	public void setMerPriv(String merPriv) {
		this.merPriv = merPriv;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	public String getResTxnId() {
		return resTxnId;
	}

	public void setResTxnId(String resTxnId) {
		this.resTxnId = resTxnId;
	}

	public String getMacStr() {
		return macStr;
	}

	public void setMacStr(String macStr) {
		this.macStr = macStr;
	}

	public String getJsonStr() {
		return jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}

	@Override
	public String toString() {
		return "BankCardResponseData [versionId=" + versionId + ", custId=" + custId + ", ordId=" + ordId
				+ ", transType=" + transType + ", merPriv=" + merPriv + ", respCode=" + respCode + ", respDesc="
				+ respDesc + ", resTxnId=" + resTxnId + ", macStr=" + macStr + ", jsonStr=" + jsonStr + "]";
	}
	
	
}
