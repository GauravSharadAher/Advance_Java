package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
	private static Connection con=null;;
	
	public static Connection getConnection() {
		
		try {
			if(con==null) {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.150:3306/dac34";
				con=DriverManager.getConnection(url,"dac34","welcome");
				if(con!=null) {
					System.out.println("Connection Established");
				}
			}
			return con;
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
				}
			}
	
	
		public static void closeMyConnection() {
			try {
				con.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
