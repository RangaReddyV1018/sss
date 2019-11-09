package com.dbs.hack2hire.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dbs.hack2hire.common.vo.Criteria;
import com.dbs.hack2hire.common.vo.DayReport;
import com.dbs.hack2hire.common.vo.Report;
import com.dbs.hack2hire.entity.EXDEntity;
import com.dbs.hack2hire.entity.FIDEntity;
import com.dbs.hack2hire.entity.MTDEntity;
import com.dbs.hack2hire.entity.YTDEntity;
import com.dbs.hack2hire.repository.EXDRepository;
import com.dbs.hack2hire.repository.FIDRepository;
import com.dbs.hack2hire.repository.MTDRepository;
import com.dbs.hack2hire.repository.YTDRepository;

@Service
public class TradeService {
	
	@Autowired YTDRepository ytdRepository;
	@Autowired MTDRepository mtdRepository;
	@Autowired EXDRepository exdRepository;
	@Autowired FIDRepository fidRepository;
	
	public List<Report> getReports(Criteria criteria) {
		
		if(criteria.isYtdReport()) {
			List<YTDEntity> entityList = ytdRepository.findAll();
			return convertYTDEntity(entityList);
		} 
		if(StringUtils.hasLength(criteria.getMTD())) {
			//Hard-coding only this month
			List<MTDEntity> entityList = mtdRepository.findAll();
			return convertMTDEntity(entityList);
		}
		if(StringUtils.hasLength(criteria.getStockName())) {
			// fetch for that stock and return the report;
		}
		if(StringUtils.hasLength(criteria.getISIN())) {
			// fetch for that ISIN and return the report;
		}
		return null;
	}
	
	public List<DayReport> getDayReport() {

		List<EXDEntity> exdEntityList = exdRepository.findAll();
		List<FIDEntity> fidEntityList = fidRepository.findAll();
		return mergeEntityList(exdEntityList, fidEntityList);
	
	}
	
	private List<DayReport> mergeEntityList(List<EXDEntity> exdEntityList, List<FIDEntity> fidEntityList) {
		Map<String, DayReport> finalReports = new HashMap<>();
		DayReport report;
		for(EXDEntity entity : exdEntityList) {
			String key = entity.getUniqueIdentifier()+entity.getTradeType().toUpperCase();
			if(finalReports.containsKey(key)) {
				DayReport existing = finalReports.get(key);
				existing.setSaleID(existing.getSaleID() + ";" + entity.getDealId());
				Float price = ((existing.getPrice()*existing.getQuantity()) +
						(Float.parseFloat(entity.getPrice())*Float.parseFloat(entity.getQuantity())))/
						(existing.getQuantity() + Float.parseFloat(entity.getQuantity()));
				existing.setPrice(price);
				existing.setQuantity(existing.getQuantity() + Integer.parseInt(entity.getQuantity()));
				finalReports.put(key, existing);
			} else {
				report = new DayReport();
				report.setISIN(entity.getUniqueIdentifier());
				report.setExchange(entity.getExchangeName());
				report.setIntraDay("Yes".equalsIgnoreCase(entity.getIntraDay()));
				report.setPrice(Float.valueOf(entity.getPrice()));
				report.setQuantity(Integer.parseInt(entity.getQuantity()));
				report.setSaleID(entity.getDealId());
				report.setStockName(entity.getEquityName());
				report.setTradeType(entity.getTradeType());
				finalReports.put(entity.getUniqueIdentifier()+entity.getTradeType().toUpperCase(), report);
			}
		}
		for(FIDEntity entity : fidEntityList) {
			String key = entity.getISIN()+entity.getBulSellIndicator().toUpperCase();
			if(finalReports.containsKey(key)) {
				DayReport existing = finalReports.get(key);
				existing.setSaleID(existing.getSaleID() + ";" + entity.getTradeId());
				Float price = ((existing.getPrice()*existing.getQuantity()) +
						(Float.parseFloat(entity.getPrice())*entity.getQuantity()))/
						(existing.getQuantity() + entity.getQuantity());
				existing.setPrice(price);
				existing.setQuantity(existing.getQuantity() + entity.getQuantity());
				finalReports.put(key, existing);
			} else {
				report = new DayReport();
				report.setISIN(entity.getISIN());
				report.setExchange(entity.getExchangeName());
				report.setPrice(Float.valueOf(entity.getPrice()));
				report.setQuantity(entity.getQuantity());
				report.setSaleID(entity.getTradeId());
				report.setStockName(entity.getStockName());
				report.setTradeType(entity.getBulSellIndicator());
				finalReports.put(entity.getISIN()+entity.getBulSellIndicator(), report);
			}
		}
		List<DayReport> reports = new ArrayList<>();
		reports.addAll(finalReports.values());
		return reports;
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
	
	private List<Report> convertMTDEntity(List<MTDEntity> entityList) {
		List<Report> reports = new ArrayList<>();
		Report report;
		for(MTDEntity entity : entityList) {
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