package com.zettamine.rfr.dao;

import java.util.List;

import com.zettamine.rfr.dto.AnnualRainFall;

public interface RainFallReportRepo {

	boolean saveAvgRainfallOfCities(int pincode, String city, double avgRainfall);

	List<AnnualRainFall> findMaximumRainfallCities();

}