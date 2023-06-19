package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao edao;

	

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		Employee e=new Employee(id,nm,sal);
		edao.save(e);
		
	}

	@Override
	public List<Employee> displayAll() {
		return edao.displayAll();
	}

	@Override
	public Employee displayById(int id) {
		return edao.displayById(id);
	}

	@Override
	public boolean deleteEmp(int id) {
		return edao.deleteById(id);
	}

	@Override
	public boolean modifyById(int id, double sal) {
	return edao.changeById(id,sal);
	}

	@Override
	public List<Employee> sortByName() {
		return edao.sort();
	}

	@Override
	public void closeMyConnection() {
	  edao.closeConnection();
		
	}

	

	

	
	

}
