package com.dashboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dashboard.repository.UserRepository;
import com.dashboard.service.UserService;
import com.dashboard.user.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getUserUsingContactNo(Long contactNo) {
		// TODO Auto-generated method stub
		return userRepo.findAllByContactNo(contactNo);
	}

}
