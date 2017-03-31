/**
 * Project web
 * @author changchun.wu
 * 2017��3��31������9:11:17
 */
package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Salary;

public interface SalaryMapper {
	/**
	 * ���Ա������нˮ
	 * Method insert
	 * Return boolean
	 * @param salary
	 * @return
	 * 2017��3��31������9:14:13
	 */
	boolean insert(Salary salary);
	/**
	 * ɾ��Ա����нˮ
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��31������9:14:43
	 */
	boolean delete(int id);
	/**
	 * �޸�Ա����нˮ
	 * Method update
	 * Return boolean
	 * @param id
	 * @param name
	 * @return
	 * 2017��3��31������9:15:06
	 */
	boolean update(int id,String name);
	/**
	 * ����нˮ��id��ĳһ��Ա����нˮ
	 * Method selectById
	 * Return Salary
	 * @param id
	 * @return
	 * 2017��3��31������9:15:46
	 */
	Salary selectById(int id);
	/**
	 * ��ѯ���е�Ա��нˮ
	 * Method select
	 * Return List<Salary>
	 * @return
	 * 2017��3��31������9:16:46
	 */
	List<Salary> select();
}


