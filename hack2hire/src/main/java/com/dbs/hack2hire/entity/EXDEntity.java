package com.dbs.hack2hire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ext")
public class EXDEntity {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name= "Exchange_Name")
	private String exchangeName;
	
	@Column(name= "Unique_Identifier")
	private String uniqueIdentifier;
	
	@Column(name= "EQUITY_NAME")
	private String equityName;
	
	@Column(name= "Quantity")
	private String quantity;
	
	@Column(name= "TRADE_TYPE")
	private String tradeType;
	
	@Column(name= "intraDay")
	private String intraDay;
	
	@Column(name= "price")
	private String price;
	
	@Column(name= "DEAL_ID")
	private String dealId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public String getEquityName() {
		return equityName;
	}

	public void setEquityName(String equityName) {
		this.equityName = equityName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getIntraDay() {
		return intraDay;
	}

	public void setIntraDay(String intraDay) {
		this.intraDay = intraDay;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDealId() {
		return dealId;
	}

	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	
	
	
	
}

