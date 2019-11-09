package com.dbs.hack2hire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dbs.hack2hire.common.vo.Criteria;
import com.dbs.hack2hire.common.vo.Report;

@Service
public class TradeService {
	
	//@Autowired YTDReport ytdreport;
	
	public Report getReports(Criteria criteria) {
		
		if(criteria.isYtdReport()) {
			// fetch and return ytdreport;
		} 
		if(StringUtils.hasLength(criteria.getMTD())) {
			// fetch that months and return mtdreport;
		}
		if(criteria.getETD() != null) {
			// get current date and return that date's report;
		}
		if(StringUtils.hasLength(criteria.getStockName())) {
			// fetch for that stock and return the report;
		}
		if(StringUtils.hasLength(criteria.getISIN())) {
			// fetch for that ISIN and return the report;
		}
		return null;
	}
	
}