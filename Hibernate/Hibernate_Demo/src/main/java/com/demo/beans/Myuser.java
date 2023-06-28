package com.demo.beans;

public class Myuser {
	private int uid;
	private String uname;
	private String email;
	public Myuser() {
		super();
	}
	public Myuser( String uname, String email) {
		super();
		this.uname = uname;
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Myuser [uid=" + uid + ", uname=" + uname + ", email=" + email + "]";
	}
	
}
