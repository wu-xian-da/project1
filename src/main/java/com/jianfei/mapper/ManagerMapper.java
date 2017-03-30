package com.jianfei.mapper;

import java.util.List;

import com.jianfei.model.Manager;

/**
 * Project web
 * @author changchun.wu
 * 2017��3��30������5:33:10
 */
public interface ManagerMapper {
	/**
	 * ��ӹ���Ա
	 * Method insert
	 * Return boolean
	 * @param manager
	 * @return
	 * 2017��3��30������5:35:15
	 */
	boolean insert(Manager manager);
	/**
	 * ɾ�����õĹ���Ա
	 * Method delete
	 * Return boolean
	 * @param id
	 * @param name
	 * @return
	 * 2017��3��30������5:35:31
	 */
	boolean delete(int id,String name);
	/**
	 * �޸Ĺ���Ա����Ϣ
	 * Method update
	 * Return boolean
	 * @param id
	 * @param name
	 * @return
	 * 2017��3��30������5:35:47
	 */
	boolean update(int id, String name);
	/**
	 * ���ݹ���Ա��id��ѯ����Ա����Ϣ
	 * Method selectById
	 * Return Manager
	 * @param id
	 * @return
	 * 2017��3��30������5:36:08
	 */
	Manager selectById(int id);
	/**
	 * ��ѯ���о��й���Ȩ�޵Ĺ���Ա��Ϣ
	 * Method select
	 * Return List<Manager>
	 * @return
	 * 2017��3��30������5:36:31
	 */
	List<Manager> select();
}


