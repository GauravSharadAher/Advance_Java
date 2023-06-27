package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.LoginC;

public class LoginDaoImpl  implements LoginDao{
	private static Connection conn;
	private static PreparedStatement psall;
	
	static 
	{
		conn=DBUtil.getMyConnection();
		try {
			psall=conn.prepareStatement("select * from user where name=? and password=? ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	@Override
	public LoginC userValidate(LoginC user) {
		
		try {
			psall.setString(1, user.getUname());
			psall.setString(2, user.getPasswd());
			ResultSet rs =psall.executeQuery();
			if(rs.next()){
				 return new LoginC(rs.getString(1),rs.getString(2)); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}


		
	}
	

