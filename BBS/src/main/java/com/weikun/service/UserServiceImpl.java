package com.weikun.service;

import java.io.InputStream;

import com.weikun.dao.IUserDAO;
import com.weikun.dao.UserDAOImpl;
import com.weikun.vo.BBSUser;

public class UserServiceImpl implements IUserService {
	private IUserDAO dao=new UserDAOImpl();
	@Override
	public BBSUser login(BBSUser user) {
		// TODO Auto-generated method stub
		return dao.login(user);
	}
	@Override
	public InputStream getPic(int id) {
		// TODO Auto-generated method stub
		return dao.getPic(id);
	}
	@Override
	public boolean register(BBSUser user) {
		// TODO Auto-generated method stub
		return dao.register(user);
	}

}
