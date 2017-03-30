package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Manager;

/**
 * Project web
 * @author changchun.wu
 * 2017年3月30日下午5:33:10
 */
public interface ManagerMapper {
	/**
	 * 添加管理员
	 * Method insert
	 * Return boolean
	 * @param manager
	 * @return
	 * 2017年3月30日下午5:35:15
	 */
	boolean insert(Manager manager);
	/**
	 * 删除无用的管理员
	 * Method delete
	 * Return boolean
	 * @param id
	 * @param name
	 * @return
	 * 2017年3月30日下午5:35:31
	 */
	boolean delete(int id,String name);
	/**
	 * 修改管理员的信息
	 * Method update
	 * Return boolean
	 * @param id
	 * @param name
	 * @return
	 * 2017年3月30日下午5:35:47
	 */
	boolean update(int id, String name);
	/**
	 * 根据管理员的id查询管理员的信息
	 * Method selectById
	 * Return Manager
	 * @param id
	 * @return
	 * 2017年3月30日下午5:36:08
	 */
	Manager selectById(int id);
	/**
	 * 查询所有具有管理权限的管理员信息
	 * Method select
	 * Return List<Manager>
	 * @return
	 * 2017年3月30日下午5:36:31
	 */
	List<Manager> select();
}


