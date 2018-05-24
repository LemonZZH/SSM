package com.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.dao.IUserDao;
import com.project.pojo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

}
