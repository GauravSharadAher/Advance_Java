package com.demo.service;

import java.util.List;

import com.demo.Dao.EmployeeDao;
import com.demo.Dao.EmployeeDaoImpl;
import com.demo.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	@Override
	public List<Employee> getAllEmp(int dno) {
	return edao.findEmp(dno);
	}
	@Override
	public void closeMyConnection() {
		edao.close();
		
	}
	
	

}
