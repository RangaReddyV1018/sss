package com.dbs.hack2hire.common.vo;

import org.springframework.stereotype.Component;

@Component
public class DayReport {

	private String ISIN;
    private String stockName;
    private String exchange;
    private int quantity;
    private String tradeType;
    private boolean intraDay;
    private float price;
    private String saleID;
    
	public String getISIN() {
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public boolean isIntraDay() {
		return intraDay;
	}
	public void setIntraDay(boolean intraDay) {
		this.intraDay = intraDay;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSaleID() {
		return saleID;
	}
	public void setSaleID(String saleID) {
		this.saleID = saleID;
	}
    
}