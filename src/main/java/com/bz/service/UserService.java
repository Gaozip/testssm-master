package com.bz.service;

import com.bz.model.User;

public interface UserService {
	public User selectByPrimaryKey(Integer userId);
	public int insert(User record);
	public int insertSelective(User record);
	public int deleteByPrimaryKey(Integer id);
	public int updateByPrimaryKeySelective(User record);
	public int updateByPrimaryKey(User record);
}
