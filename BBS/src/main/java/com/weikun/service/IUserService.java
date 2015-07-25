package com.weikun.service;

import java.io.InputStream;

import com.weikun.vo.BBSUser;

public interface IUserService {
	public BBSUser login(BBSUser user) ;
	public InputStream getPic(int id) ;
	public boolean register(BBSUser user) ;
}
