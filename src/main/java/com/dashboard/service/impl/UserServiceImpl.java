package com.dashboard.service.impl;

import java.util.List;

import com.dashboard.user.Swemsewak;
import org.springframework.beans.factory.annotation.Autowired;

import com.dashboard.repository.UserRepository;
import com.dashboard.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public Swemsewak save(Swemsewak swemsewak) {
		// TODO Auto-generated method stub
		return userRepo.save(swemsewak);
	}

	@Override
	public List<Swemsewak> getUserUsingContactNo(Long contactNo) {
		// TODO Auto-generated method stub
		return userRepo.findAllByContactNo(contactNo);
	}

}
