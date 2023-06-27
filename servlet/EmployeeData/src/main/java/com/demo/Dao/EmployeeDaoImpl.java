package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Connection conn;
	private static PreparedStatement psall;
	
	static 
	{
		conn=DBUtil.getMyConnection();
		try {
			psall=conn.prepareStatement("select empno,ename,sal from emp where deptno=?;");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> findEmp(int dno) {
	
		List<Employee> elist= new ArrayList<>();
		try {
			psall.setInt(1, dno);
			ResultSet rs=psall.executeQuery();
			while(rs.next()) {
				elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getFloat(3)));
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
