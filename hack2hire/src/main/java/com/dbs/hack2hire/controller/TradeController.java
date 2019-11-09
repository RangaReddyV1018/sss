package com.dbs.hack2hire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.hack2hire.common.vo.Criteria;
import com.dbs.hack2hire.common.vo.Report;
import com.dbs.hack2hire.service.TradeService;

@RestController
@RequestMapping(path = "/trade")
public class TradeController {

	@Autowired private TradeService tradeService;
	
	@PostMapping(path = "/getReports", consumes = "application/json", produces = "application/json")
    public Report getReports(Criteria criteria) {

		return null;
    }
}