package com.project.dao;

import java.util.List;

import com.project.pojo.User;

public interface IUserDao {
	
	public abstract List<User> selectAll();
}
