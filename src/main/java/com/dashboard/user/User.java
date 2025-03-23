package com.dashboard.user;

import com.dashboard.constant.Daitv;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User {

	private Long id;
	private String name;
	private Long contactNo;
	private String shaka;
	private String address;
	private int age;
	private Daitv daitiv;
	
}
