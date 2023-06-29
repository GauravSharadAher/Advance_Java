package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany(mappedBy = "eset")
	Set<Project> pset;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, Set<Project> pset) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.pset = pset;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Set<Project> getPset() {
		return pset;
	}
	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename +  "]";
	}
	
}
