/**
 * Project web
 * @author changchun.wu
 * 2017年3月31日上午9:08:20
 */
package com.jianfei.model;

public class Salary {
	private Integer id;
	private String name;
	private double salary;
	private Postion postion;
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
	public Postion getPostion() {
		return postion;
	}
	public void setPostion(Postion postion) {
		this.postion = postion;
	}
	@Override
	public String toString() {
		return "Salary [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", postion=" + postion + "]";
	}
	public Salary() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}


