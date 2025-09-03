package com.dashboard.service;

import java.util.List;

import com.dashboard.user.Swemsewak;

public interface UserService {
	Swemsewak save(Swemsewak swemsewak);
	List<Swemsewak> getUserUsingContactNo(Long contactNo);
}
