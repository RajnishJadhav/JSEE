package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

public class DBUtil {
	private static Connection conn;
	
	public static Connection MyConnectionOpen()
	{
		if(conn==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.150:3306/dac30?useSSL=false";
				conn=DriverManager.getConnection(url, "dac30", "welcome");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return conn;
	}
	
	public static Connection MyConnectionClose() throws SQLException
	{
		if(conn != null)
		{
			conn.close();
		}
		
		return conn;
	}

}
