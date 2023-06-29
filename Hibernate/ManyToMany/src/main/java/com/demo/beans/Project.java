package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;

@Entity
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany
	@JoinTable(name="emp_proj",joinColumns= {@JoinColumn(name="emp_id")},inverseJoinColumns = {@JoinColumn(name="proj_id")})
	Set<Employee> eset;
	public Project() {
		super();
	}
	public Project(int pid, String pname, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.eset = eset;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", eset=" +eset+ "]";
	}
	
}
