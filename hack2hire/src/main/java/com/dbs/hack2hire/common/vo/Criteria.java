package com.dbs.hack2hire.common.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Criteria {

	private String stockName;
	private String ISIN;
	private boolean ytdReport;
	private String MTD;
	private Date ETD;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getISIN() {
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	public boolean isYtdReport() {
		return ytdReport;
	}
	public void setYtdReport(boolean ytdReport) {
		this.ytdReport = ytdReport;
	}
	public String getMTD() {
		return MTD;
	}
	public void setMTD(String mTD) {
		MTD = mTD;
	}
	public Date getETD() {
		return ETD;
	}
	public void setETD(Date eTD) {
		ETD = eTD;
	}
	
}