package com.weikun.dao;

import java.util.List;

import com.weikun.vo.User;

public interface IUserDAO {
	public boolean login(User user); //true:success false:failure
	public List<User> query();
	public User queryById(int id);
	public boolean del(User user);
	public boolean add(User user);
	public boolean update(User user);
}
