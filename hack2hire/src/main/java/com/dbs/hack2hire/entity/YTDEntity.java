package com.dbs.hack2hire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ytd")
public class YTDEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private int id;
	
	@Column(name="id")
	private String stockName ;
	
	@Column(name="id")
	private String holdingQunatity;
	@Column(name="id")
	private String ISIN;
	private String avgbuyPrice;
	private String currentVal;
	private String unrealisePnl;
	private String realizedPnl;
	
	
	
}
