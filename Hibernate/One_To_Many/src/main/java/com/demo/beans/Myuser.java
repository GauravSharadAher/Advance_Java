package com.demo.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="user123")
public class Myuser {
	@Id
	private int uid;
	private String uname;
	@OneToMany(mappedBy = "u1",cascade = CascadeType.ALL)
	Set<Address> addr;
	public Myuser() {
		super();
	}
	public Myuser(int uid, String uname, Set<Address> addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
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
	public Set<Address> getAddr() {
		return addr;
	}
	public void setAddr(Set<Address> addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Myuser [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}
	
}
