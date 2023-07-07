package com.demo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Myuser {
	@Value("12")
	private int pid;
	@Value("user1")
	private String pname;
	@Autowired
	private Address addr;
	public Myuser() {
		super();
	}
	public Myuser(int pid, String pname, Address addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.addr = addr;
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Myuser [pid=" + pid + ", pname=" + pname + ", addr=" + addr + "]";
	}
	@PostConstruct
	public void myinit() {
		System.out.println("in my custom init method");
	}
	
	@PreDestroy
	public void mydestroy() {
		System.out.println("in my custom destroy method");
	}
	

}
