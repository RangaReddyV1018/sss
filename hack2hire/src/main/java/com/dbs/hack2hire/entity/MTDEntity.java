package com.dbs.hack2hire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mtd")
public class MTDEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private int id;
	
	@Column(name="stock Name")
	private String stockName ;
	
	@Column(name="Holding Quantity")
	private String holdingQunatity;
	
	@Column(name="ISIN")
	private String ISIN;
	
	@Column(name="Average Buy Price")
	private String avgbuyPrice;
	
	@Column(name="Current Market Price")
	private String curMarketPrice;
	
	@Column(name="Current Value")
	private String currentVal;
	
	@Column(name="Unrealsied PnL")
	private String unrealisePnl;
	
	@Column(name="Realised PnL")
	private String realizedPnl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getHoldingQunatity() {
		return holdingQunatity;
	}

	public void setHoldingQunatity(String holdingQunatity) {
		this.holdingQunatity = holdingQunatity;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getAvgbuyPrice() {
		return avgbuyPrice;
	}

	public void setAvgbuyPrice(String avgbuyPrice) {
		this.avgbuyPrice = avgbuyPrice;
	}

	public String getCurMarketPrice() {
		return curMarketPrice;
	}

	public void setCurMarketPrice(String curMarketPrice) {
		this.curMarketPrice = curMarketPrice;
	}

	public String getCurrentVal() {
		return currentVal;
	}

	public void setCurrentVal(String currentVal) {
		this.currentVal = currentVal;
	}

	public String getUnrealisePnl() {
		return unrealisePnl;
	}

	public void setUnrealisePnl(String unrealisePnl) {
		this.unrealisePnl = unrealisePnl;
	}

	public String getRealizedPnl() {
		return realizedPnl;
	}

	public void setRealizedPnl(String realizedPnl) {
		this.realizedPnl = realizedPnl;
	}

}
