/**
 * Project web
 * @author changchun.wu
 * 2017年3月31日上午9:11:17
 */
package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Salary;

public interface SalaryMapper {
	/**
	 * 添加员工个人薪水
	 * Method insert
	 * Return boolean
	 * @param salary
	 * @return
	 * 2017年3月31日上午9:14:13
	 */
	boolean insert(Salary salary);
	/**
	 * 删除员工的薪水
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月31日上午9:14:43
	 */
	boolean delete(int id);
	/**
	 * 修改员工的薪水
	 * Method update
	 * Return boolean
	 * @param id
	 * @param name
	 * @return
	 * 2017年3月31日上午9:15:06
	 */
	boolean update(int id,String name);
	/**
	 * 根据薪水的id查某一个员工的薪水
	 * Method selectById
	 * Return Salary
	 * @param id
	 * @return
	 * 2017年3月31日上午9:15:46
	 */
	Salary selectById(int id);
	/**
	 * 查询所有的员工薪水
	 * Method select
	 * Return List<Salary>
	 * @return
	 * 2017年3月31日上午9:16:46
	 */
	List<Salary> select();
}


