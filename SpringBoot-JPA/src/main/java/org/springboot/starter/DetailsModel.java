package org.springboot.starter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailsModel {
	
	@Id
	private int aid;
	private String aname;
	private String pwd;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
	

}
