package com.weikun.service;

import java.util.List;

import com.weikun.dao.*;
import com.weikun.vo.User;

public class UserServiceImpl implements IUserService {
	private IUserDAO dao=new UserDAOImpl();
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return dao.login(user);
	}
	@Override
	public List<User> query() {
		// TODO Auto-generated method stub
		return dao.query();
	}
	@Override
	public boolean del(User user) {
		// TODO Auto-generated method stub
		return dao.del(user);
	}
	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}
	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return dao.update(user);
	}
	
}
