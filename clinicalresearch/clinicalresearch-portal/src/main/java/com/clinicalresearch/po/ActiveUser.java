package com.clinicalresearch.po;

import java.util.Date;
import java.util.List;

public class ActiveUser {
	

	private String userid;

	private String userName;

	private String position;

	private String password;

	private String realname;

	private String status;

	private Date timestamp;
	//权限列表
	private List<Powers> powers;
	//角色列表
	private List<Roles> roles ;
	

	public List<Powers> getPowers() {
		return powers;
	}

	public void setPowers(List<Powers> powers) {
		this.powers = powers;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
