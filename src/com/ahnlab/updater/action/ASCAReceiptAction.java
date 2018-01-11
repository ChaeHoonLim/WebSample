package com.ahnlab.updater.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class ASCAReceiptAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	private String RD = "";		
	private String result = "";
	
	/**
	 * @summary: Echo Client's request
	 * @param: RD
	 * RD={
	 *  	"TAG" : "ASCA_20140915",
	 *  	"FILES" : [
	 *  		"FILE_NAME" : "ASCA_20140915_001",
	 *			"FILE_NAME" : "ASCA_20140915_002",
	 *			"FILE_NAME" : "ASCA_20140915_003"
	 *  	]  	
	 *  }
	 *  
	 * @return: 
	 * RETURN={
	 *  	"TAG" : "ASCA_20140915",
	 *  	"FILES" : [
	 *  		"FILE_NAME" : "ASCA_20140915_001",
	 *			"FILE_NAME" : "ASCA_20140915_002",
	 *			"FILE_NAME" : "ASCA_20140915_003"
	 *  	]  	
	 *  }
	 */
	private Logger logger = Logger.getLogger(this.getClass());
	public String uploadMetaData() {
		String result = SUCCESS;
		logger.debug("[start] upload meta-data");
		
		logger.debug("[finish] upload meta-data");
		return result;
	}
	
	
	
	public String uploadFileData() {
		String result = SUCCESS;
		logger.debug("[start] upload file");
		
		logger.debug("[finish] upload file");
		return result;
	}
	
	public String getRD() {
		return RD;
	}
	public void setRD(String rD) {
		RD = rD;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
