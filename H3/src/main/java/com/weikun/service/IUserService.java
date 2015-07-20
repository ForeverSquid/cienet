package com.weikun.service;

import java.util.List;

import com.weikun.vo.User;

public interface IUserService {
	public boolean login(User user); //true:success false:failure
	public List<User> query() ;
	public boolean del(User user) ;
}
