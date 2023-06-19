package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addEmp();

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteEmp(int id);

	boolean modifyById(int id, double sal);

	List<Employee> sortByName();

	void closeMyConnection();

	

	

}
