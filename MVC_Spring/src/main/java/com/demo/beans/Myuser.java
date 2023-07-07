package com.demo.beans;

public class Myuser {
	private String name;
	private String password;
	private String role;
	public Myuser() {
		super();
	}
	public Myuser(String name, String password, String role) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Myuser [name=" + name + ", password=" + password + ", role=" + role + "]";
	}
	

}
