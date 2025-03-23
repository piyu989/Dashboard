package com.dashboard.service;

import java.util.List;

import com.dashboard.user.User;

public interface UserService {
	User save(User user);
	List<User> getUserUsingContactNo(Long contactNo);
}
