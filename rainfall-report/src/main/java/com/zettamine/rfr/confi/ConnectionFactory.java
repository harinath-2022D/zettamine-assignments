package com.zettamine.rfr.confi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection con = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(con == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("dbConfi");
			
			String driverClass = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url");
			String username = bundle.getString("jdbc.username");
			String password = bundle .getString("jdbc.password");
			
			Class.forName(driverClass);
			con = DriverManager.getConnection(url,username,password);
		}
		return con;
		
	}
}
