package com.jianfei.mapper;



import java.util.List;

import com.jianfei.model.User;
/**
 * Project web
 * @author changchun.wu
 * 下午5:02:28
 */
public interface UserMapper {
	/**
	 * 添加用户
	 * 
	 * Method insert
	 * Return boolean
	 * @param user
	 * @return
	 * 2017年3月30日
	 */
	boolean insert(User user);
	/**
	 * 删除用户
	 * 
	 * Method delete
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月30日
	 */
	boolean delete(int id);
	/**
	 * 修改用户
	 * 
	 * Method uodate
	 * Return boolean
	 * @param id
	 * @return
	 * 2017年3月30日
	 */
	boolean update(int id);
	/**
	 * 根据id查用户
	 * 
	 * Method selectByid
	 * Return User
	 * @param id
	 * @return
	 * 2017年3月30日
	 */
	User selectByid(int id);
	/**
	 * 查询所有用户
	 * 
	 * Method select
	 * Return List<User>
	 * @return
	 * 2017年3月30日
	 */
	List<User> select();
}


