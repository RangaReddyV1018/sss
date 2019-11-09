package com.dbs.hack2hire.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dbs.hack2hire.common.vo.Criteria;
import com.dbs.hack2hire.common.vo.Report;
import com.dbs.hack2hire.entity.YTDEntity;
import com.dbs.hack2hire.repository.YTDRepository;

@Service
public class TradeService {
	
	@Autowired YTDRepository ytdRepository;
	
	public List<Report> getReports(Criteria criteria) {
		
		if(criteria.isYtdReport()) {
			List<YTDEntity> entityList = ytdRepository.findAll();
			return convertYTDEntity(entityList);
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
	
	private List<Report> convertYTDEntity(List<YTDEntity> entityList) {
		List<Report> reports = new ArrayList<>();
		Report report;
		for(YTDEntity entity : entityList) {
			report = new Report();
			report.setAverageBuyPrice(Float.parseFloat(entity.getAvgbuyPrice()));
			report.setCurrentMarketPrice(Float.parseFloat(entity.getCurMarketPrice()));
			report.setHoldingQuantity(Integer.parseInt(entity.getHoldingQunatity()));
			report.setISIN(entity.getISIN());
			report.setRealisedPnL(Float.parseFloat(entity.getRealizedPnl()));
			report.setStockName(entity.getStockName());
			report.setUnrealisedPnL(Float.parseFloat(entity.getUnrealisePnl()));
			reports.add(report);
		}
		return reports;
	}
	
}