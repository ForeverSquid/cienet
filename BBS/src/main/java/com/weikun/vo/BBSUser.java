package com.weikun.vo;

import java.io.Serializable;

public class BBSUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fpath;//blob存取的文件路径
	
	public String getFpath() {
		return fpath;
	}
	public void setFpath(String fpath) {
		this.fpath = fpath;
	}
	private int id;
	private String username;
	private String password;
	private int pagenum;//分页的默认每页行数
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	
}
