package com.dbs.hack2hire.hack2hire.common.vo;

public class Report {

    private String stockName;
    private int holdingQuantity;
    private String ISIN;
    private float averageBuyPrice;
    private float currentMarketPrice;
    private float unrealisedPnL;
    private float realisedPnL;
    
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getHoldingQuantity() {
		return holdingQuantity;
	}
	public void setHoldingQuantity(int holdingQuantity) {
		this.holdingQuantity = holdingQuantity;
	}
	public String getISIN() {
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	public float getAverageBuyPrice() {
		return averageBuyPrice;
	}
	public void setAverageBuyPrice(float averageBuyPrice) {
		this.averageBuyPrice = averageBuyPrice;
	}
	public float getCurrentMarketPrice() {
		return currentMarketPrice;
	}
	public void setCurrentMarketPrice(float currentMarketPrice) {
		this.currentMarketPrice = currentMarketPrice;
	}
	public float getUnrealisedPnL() {
		return unrealisedPnL;
	}
	public void setUnrealisedPnL(float unrealisedPnL) {
		this.unrealisedPnL = unrealisedPnL;
	}
	public float getRealisedPnL() {
		return realisedPnL;
	}
	public void setRealisedPnL(float realisedPnL) {
		this.realisedPnL = realisedPnL;
	}
    
}