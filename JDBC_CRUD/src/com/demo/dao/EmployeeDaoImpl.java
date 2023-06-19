package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl  implements EmployeeDao{

	private static Connection con;
	private static PreparedStatement psadd,psshow,psdisid,psdel,psupd,pssort;
	static {
		;
		try {
			con=ConnectionMain.getConnection();
			psadd=con.prepareStatement("insert into emp (empno,ename,sal,deptno) values (?,?,?,10)");
			psshow=con.prepareStatement("select empno,ename,sal from emp ");
			psdisid=con.prepareStatement("select empno,ename,sal from emp where empno=?");
			psdel=con.prepareStatement("delete from emp where empno=?");
			psupd=con.prepareStatement("update emp set sal=? where empno=?");
			pssort=con.prepareStatement("select  empno,ename,sal from emp order by ename;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void save(Employee e) {
		try {
			psadd.setInt(1, e.getId());
			psadd.setString(2, e.getName());
			psadd.setDouble(3, e.getSalary());
			psadd.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	@Override
	public List<Employee> displayAll() {
		List<Employee> elist= new ArrayList<>();
		try {
			ResultSet rs=psshow.executeQuery();
			while(rs.next()) {
				int empid=rs.getInt(1);
				String name=rs.getString(2);
				double sal= rs.getDouble(3);
				elist.add(new Employee(empid,name,sal));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;
		
	}
	@Override
	public Employee displayById(int id) {
		Employee emp= new Employee();
		try {
			psdisid.setInt(1, id);
			ResultSet rs = psdisid.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean deleteById(int id) {
		try {
			psdel.setInt(1, id);
			int rs=psdel.executeUpdate();
			return rs>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean changeById(int id, double sal) {
		
		try {
			psupd.setDouble(1, sal);
			psupd.setInt(2, id);
			int rs= psupd.executeUpdate();
			return rs>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public List<Employee> sort() {
		List<Employee> esort= new ArrayList<>();
		try {
			ResultSet rs = pssort.executeQuery();
			while(rs.next()) {
				esort.add(new Employee (rs.getInt(1),rs.getString(2),rs.getDouble(3)));
			}
			return esort;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public void closeConnection() {
		ConnectionMain.closeMyConnection();
	}
	
	

}
