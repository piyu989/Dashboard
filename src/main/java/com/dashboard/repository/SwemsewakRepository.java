package com.dashboard.repository;

import java.util.List;

import com.dashboard.user.Swemsewak;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.controller.UserController;

public interface SwemsewakRepository extends JpaRepository<UserController, Long> {
	List<Swemsewak> findAllByContactNo(Long contactNo);
	List<Swemsewak> findAll(Long contactNo);
}
