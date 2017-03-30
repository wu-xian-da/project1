package com.jianfei.mapper;



import java.util.List;

import com.jianfei.model.User;
/**
 * Project web
 * @author changchun.wu
 * ����5:02:28
 */
public interface UserMapper {
	/**
	 * ����û�
	 * 
	 * Method insert
	 * Return boolean
	 * @param user
	 * @return
	 * 2017��3��30��
	 */
	boolean insert(User user);
	/**
	 * ɾ���û�
	 * 
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��30��
	 */
	boolean delete(int id);
	/**
	 * �޸��û�
	 * 
	 * Method uodate
	 * Return boolean
	 * @param id
	 * @return
	 * 2017��3��30��
	 */
	boolean update(int id);
	/**
	 * ����id���û�
	 * 
	 * Method selectByid
	 * Return User
	 * @param id
	 * @return
	 * 2017��3��30��
	 */
	User selectByid(int id);
	/**
	 * ��ѯ�����û�
	 * 
	 * Method select
	 * Return List<User>
	 * @return
	 * 2017��3��30��
	 */
	List<User> select();
}


