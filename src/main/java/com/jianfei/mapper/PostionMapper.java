package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Postion;

/**
 * Project web
 * @author changchun.wu
 * 2017��3��30������5:10:33
 */
public interface PostionMapper {
	/**
	 * ��Ӹ�λ
	 * 
	 * Method insert
	 * Return boolean
	 * @param postion
	 * @return
	 * 2017��3��30������5:13:46
	 */
	boolean insert(Postion postion);
	/**
	 * ɾ����λ
	 * 
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��30������5:14:09
	 */
	boolean delete(int id);
	/**
	 * �޸ĸ�λ
	 * 
	 * Method update
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��30������5:14:31
	 */
	boolean update(int id);
	/**
	 * ����id���λ
	 * 
	 * Method selectById
	 * Return Postion
	 * @param id
	 * @return
	 * 2017��3��30������5:14:45
	 */
	Postion selectById(int id);
	/**
	 * ��ѯ���и�λ
	 * 
	 * Method select
	 * Return List<Postion>
	 * @return
	 * 2017��3��30������5:15:05
	 */
	List<Postion> select();
}


