package com.test.springrest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int sid;
	String sname;
	String sBranch;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsBranch() {
		return sBranch;
	}
	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}
	
	

}
