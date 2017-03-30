package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Postion;

/**
 * Project web
 * @author changchun.wu
 * 2017年3月30日下午5:10:33
 */
public interface PostionMapper {
	/**
	 * 添加岗位
	 * 
	 * Method insert
	 * Return boolean
	 * @param postion
	 * @return
	 * 2017年3月30日下午5:13:46
	 */
	boolean insert(Postion postion);
	/**
	 * 删除岗位
	 * 
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月30日下午5:14:09
	 */
	boolean delete(int id);
	/**
	 * 修改岗位
	 * 
	 * Method update
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月30日下午5:14:31
	 */
	boolean update(int id);
	/**
	 * 根据id查岗位
	 * 
	 * Method selectById
	 * Return Postion
	 * @param id
	 * @return
	 * 2017年3月30日下午5:14:45
	 */
	Postion selectById(int id);
	/**
	 * 查询所有岗位
	 * 
	 * Method select
	 * Return List<Postion>
	 * @return
	 * 2017年3月30日下午5:15:05
	 */
	List<Postion> select();
}


