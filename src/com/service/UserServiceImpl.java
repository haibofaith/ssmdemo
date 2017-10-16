package com.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UserTMapper;
import com.model.UserT;
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private UserTMapper userDao;
	
	@Override
	public UserT getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
