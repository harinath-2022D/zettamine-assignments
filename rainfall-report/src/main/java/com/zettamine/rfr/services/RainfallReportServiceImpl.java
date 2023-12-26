package com.zettamine.rfr.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.zettamine.rfr.confi.ConnectionFactory;
import com.zettamine.rfr.dao.RainFallReportRepo;
import com.zettamine.rfr.dao.RainfallReportRepoImpl;
import com.zettamine.rfr.dto.AnnualRainFall;
import com.zettamine.rfr.exceptions.InvalidPincodeException;

public class RainfallReportServiceImpl implements RainFallReportService {

	private RainFallReportRepo repo = new RainfallReportRepoImpl();
	
	@Override
	public void saveAvgRainfallData(String PATH) {
		try {
			FileReader reader = new FileReader(PATH);
			BufferedReader br = new BufferedReader(reader);

			String str = br.readLine();
			while (!(str == null)) {
				try {
					processData(str);
				} catch (InvalidPincodeException e) {
					System.out.println(e.getMessage());
				}
				str = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void processData(String str) throws InvalidPincodeException {
		String[] arr = str.split(",");
		if (arr.length < 14) {
			throw new RuntimeException("Invalid data");
		} else {
			boolean checkDigits = arr[0].matches("^[0-9]+");
			if (arr[0].length() < 5 || checkDigits == false) {
				throw new InvalidPincodeException("Invalid city pincode");
			} else {
				int pincode = Integer.parseInt(arr[0]);
				double avgRainfall = calculateAvgRainFall(arr);
				repo.saveAvgRainfallOfCities(pincode,arr[1],avgRainfall);
			}

		}

	}

	private double calculateAvgRainFall(String[] arr) {
		double total = 0;
		for (int i = 2; i < arr.length; i++) {
			total += Double.parseDouble(arr[i]);
		}
		return (double) (total / 12d);
	}

	@Override
	public List<AnnualRainFall> findMaximumRainfallCities() {
		List<AnnualRainFall> list = repo.findMaximumRainfallCities();
		if(list.size() == 0) {
			System.out.println("No city available");
		}
		return list;
	}

}
