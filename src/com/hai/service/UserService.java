package com.hai.service;

import java.util.List;

import com.hai.pojo.User;

public interface UserService {
	List<User> list();
	void add(User c);
	//验证登录
	User loginCheck(User c);
}
