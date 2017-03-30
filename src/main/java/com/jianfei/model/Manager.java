package com.jianfei.model;
/**
 * Project web
 * @author changchun.wu
 * 2017年3月30日下午5:29:27
 */
public class Manager {
	private Integer id;
	private String name;
	private String password;
	private int age;
	private String sex;
	private double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Manager() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", password="
				+ password + ", age=" + age + ", sex=" + sex + ", salary="
				+ salary + "]";
	}
	
	
}


