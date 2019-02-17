package com.bz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bz.dao.UserMapper;
import com.bz.model.User;
import com.bz.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	

	public int insert(User record) {
		// TODO Auto-generated method stub
		return this.userMapper.insert(record);
	}

	public User selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return this.userMapper.insertSelective(record);
	}

	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.userMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return this.userMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return this.userMapper.updateByPrimaryKey(record);
	}

}
