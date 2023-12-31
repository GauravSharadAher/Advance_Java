package com.demo.beans;

import java.util.Objects;

public class Employee {
	private int empno;
	private String ename;
	private float sal;
	public Employee() {
		super();
	}
	public Employee(int empno, String ename, float sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public int hashCode() {
		return empno;
	}
	@Override
	public boolean equals(Object obj) {
		 return empno==((Employee) obj).empno;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	

}
