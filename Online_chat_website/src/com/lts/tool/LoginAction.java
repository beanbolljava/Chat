package com.lts.tool;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
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
	
	public String execute() throws Exception{
		
		//TODO判断用户名和密码是否符合要求
		
		if("admin".equals(this.getUsername().trim())&&"admin".equals(this.getPassword().trim())) {
			return SUCCESS;
		}
		else {
			this.addFieldError("username","用户名或密码错误!");
		}
		return INPUT;
	}
	
	public void validate() {
		if(null==this.getUsername()||"".equals(this.getUsername().trim())) {
			this.addFieldError("username", "用户名不能为空");
		}
		if(null==this.getPassword()||"".equals(this.getPassword().trim())) {
			this.addFieldError("password", "密码不能为空");
		}
	}
}
