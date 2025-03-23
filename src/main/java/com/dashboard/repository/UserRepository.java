package com.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.controller.UserController;
import com.dashboard.user.User;

public interface UserRepository extends JpaRepository<UserController, Long> {
	List<User> findAllByContactNo(Long contactNo);
}
