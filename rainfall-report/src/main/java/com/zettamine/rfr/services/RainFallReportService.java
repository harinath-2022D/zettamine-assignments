package com.zettamine.rfr.services;

import java.util.List;

import com.zettamine.rfr.dto.AnnualRainFall;

public interface RainFallReportService {

	void saveAvgRainfallData(String PATH);

	List<AnnualRainFall> findMaximumRainfallCities();

}