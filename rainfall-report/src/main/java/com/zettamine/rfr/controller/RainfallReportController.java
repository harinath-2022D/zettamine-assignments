package com.zettamine.rfr.controller;

import java.util.List;

import com.zettamine.rfr.dto.AnnualRainFall;
import com.zettamine.rfr.services.RainfallReportServiceImpl;

public class RainfallReportController {
	
	private static RainfallReportServiceImpl rrs = new RainfallReportServiceImpl();
	
	public static void main(String[] args) {
		String PATH = "C:\\Users\\Harinath\\Desktop\\CustFolder\\AllCityMonthlyRainfall.txt";
		rrs.saveAvgRainfallData(PATH);
		
		System.out.println("@".repeat(64));
		
		List<AnnualRainFall> list = rrs.findMaximumRainfallCities();
		
		for(AnnualRainFall obj : list) {
			System.out.println(obj.toString());
		}
	}
}
