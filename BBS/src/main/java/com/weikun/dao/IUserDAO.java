package com.weikun.dao;

import java.io.InputStream;

import com.weikun.vo.BBSUser;

public interface IUserDAO {
	public BBSUser login(BBSUser user);
	public boolean register(BBSUser user);
	public InputStream getPic(int id);
	
}
