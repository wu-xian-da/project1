package com.jianfei.model;
/**
 * Project web
 * @author changchun.wu
 * 下午4:59:26
 */
public class Postion {
	private Integer id;
	private String name;
	private double salary;
	private Employee employee;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Postion() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return "Postion [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", employee=" + employee + "]";
	}
	
}


