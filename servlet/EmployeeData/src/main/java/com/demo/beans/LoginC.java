package com.demo.beans;

public class LoginC {
	private String uname;
	private String passwd;
	public LoginC() {
		super();
	}
	public LoginC(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "LoginC [uname=" + uname + ", passwd=" + passwd + "]";
	}
	
	

}
