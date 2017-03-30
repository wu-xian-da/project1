package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Employee;

/**
 * Project web
 * @author changchun.wu
 * 2017��3��30������5:16:40
 */
public interface EmployeeMapper {
	/**
	 * ���Ա��
	 * Method insert
	 * Return boolean
	 * @param employee
	 * @return
	 * 2017��3��30������5:18:49
	 */
	boolean insert(Employee employee);
	/**
	 * ɾ��Ա��
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��30������5:19:12
	 */
	boolean delete(int id);
	/**
	 * �޸�Ա��
	 * Method update
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��30������5:19:43
	 */
	boolean update(int id);
	/**
	 * ����id��ѯԱ��
	 * Method selectById
	 * Return Employee
	 * @param id
	 * @return
	 * 2017��3��30������5:19:55
	 */
	Employee selectById(int id);
	/**
	 * ��ѯ����Ա��
	 * Method select
	 * Return List<Employee>
	 * @return
	 * 2017��3��30������5:20:15
	 */
	List<Employee> select();
}


