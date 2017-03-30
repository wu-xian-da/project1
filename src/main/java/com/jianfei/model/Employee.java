package com.jianfei.model;
/**
 * Project web
 * @author changchun.wu
 * 下午4:53:12
 */
public class Employee {
	private Integer id;
	private String name;
	private String password;
	private String sex;
	private String address;
	private int age;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password="
				+ password + ", sex=" + sex + ", address=" + address + ", age="
				+ age + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}


