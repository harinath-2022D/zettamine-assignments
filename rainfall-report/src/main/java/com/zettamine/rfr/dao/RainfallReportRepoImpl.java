package com.zettamine.rfr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.zettamine.rfr.confi.ConnectionFactory;
import com.zettamine.rfr.dto.AnnualRainFall;

public class RainfallReportRepoImpl implements RainFallReportRepo {
	private static Connection con = null;
	private static PreparedStatement st = null;
	
	public RainfallReportRepoImpl() {
	try {
		con = ConnectionFactory.getConnection();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
	@Override
	public boolean saveAvgRainfallOfCities(int pincode, String city, double avgRainfall) {
		try {
			
			 st = con.prepareStatement("insert into rainfall_report values (?,?,?)");
			st.setInt(1, pincode);
			st.setString(2, city);
			st.setDouble(3, avgRainfall);

			int rowsInserted = st.executeUpdate();
			if(rowsInserted>0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return false;
	}
	
	@Override
	public List<AnnualRainFall> findMaximumRainfallCities(){
		List<AnnualRainFall> list = new LinkedList<>();
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement st = con.prepareStatement(
					"select * from rainfall_report where average_annual_rainfall in (select max(average_annual_rainfall) from rainfall_report);");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				int pincode = rs.getInt(1);
				String city = rs.getString(2);
				double avgRainfall = rs.getDouble(3);
				AnnualRainFall arf = new AnnualRainFall(pincode, city, avgRainfall);
				list.add(arf);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}
}
