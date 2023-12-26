package com.zettamine.rfr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnnualRainFall {
	
	private int pincode;
	private String cityName;
	private double avgRainfall;
}
