package com.sag.game;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	IDataService dataService;
	
	public BusinessCalculationService(IDataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
