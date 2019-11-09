package com.dbs.hack2hire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="fid")
public class FIDEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name= "TRADEID")
	private String tradeId;
	
	@Column(name= "StockName")
	private String stockName;
	
	@Column(name= "ISIN")
	private String ISIN;
	
	@Column(name= "Quantity")
	private int quantity;
	
	@Column(name= "Buy_Sell_Indicator")
	private String bulSellIndicator;
	
	@Column(name= "price")
	private String price;
	
	@Column(name= "Exchange_Name")
	private String exchangeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBulSellIndicator() {
		return bulSellIndicator;
	}

	public void setBulSellIndicator(String bulSellIndicator) {
		this.bulSellIndicator = bulSellIndicator;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	
	
	
	
}
