package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Dept;

public class DeptDaoImpl implements DeptDao {
	
	private static Connection conn;
	private static PreparedStatement psall;
	
	static 
	{
		conn=DBUtil.getMyConnection();
		try {
			psall=conn.prepareStatement("select * from dept");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Dept> displayAll() {
		List<Dept> dlist= new ArrayList<>();
		try {
			ResultSet rs =psall.executeQuery();
			while(rs.next()) {
				dlist.add(new  Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			return dlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
