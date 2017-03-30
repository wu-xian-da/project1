package com.jianfei.model;
/**
 * Project web
 * @author changchun.wu
 * 下午4:26:14
 */
public class User {
	private Integer id;
	private String name;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
	
}


