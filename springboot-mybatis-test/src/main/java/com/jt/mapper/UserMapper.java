package com.jt.mapper;

import java.util.List;

import com.jt.pojo.User;

public interface UserMapper {
	
	/**查询所有用户信息*/
	List<User> selectObjects();
	
}
