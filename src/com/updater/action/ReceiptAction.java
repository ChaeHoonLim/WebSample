package com.updater.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class ReceiptAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	private String RD = "";		
	private String result = "";

	private Logger logger = Logger.getLogger(this.getClass());
	
	/* post method */
	public String create() {
		String result = SUCCESS;
		
		return result;
	}
	
	/* get method */
	public String show() {
		String result = SUCCESS;
		
		return result;
	}
	
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
