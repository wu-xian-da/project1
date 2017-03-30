package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Employee;

/**
 * Project web
 * @author changchun.wu
 * 2017年3月30日下午5:16:40
 */
public interface EmployeeMapper {
	/**
	 * 添加员工
	 * Method insert
	 * Return boolean
	 * @param employee
	 * @return
	 * 2017年3月30日下午5:18:49
	 */
	boolean insert(Employee employee);
	/**
	 * 删除员工
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月30日下午5:19:12
	 */
	boolean delete(int id);
	/**
	 * 修改员工
	 * Method update
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月30日下午5:19:43
	 */
	boolean update(int id);
	/**
	 * 根据id查询员工
	 * Method selectById
	 * Return Employee
	 * @param id
	 * @return
	 * 2017年3月30日下午5:19:55
	 */
	Employee selectById(int id);
	/**
	 * 查询所有员工
	 * Method select
	 * Return List<Employee>
	 * @return
	 * 2017年3月30日下午5:20:15
	 */
	List<Employee> select();
}


