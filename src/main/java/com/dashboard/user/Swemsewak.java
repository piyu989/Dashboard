package com.dashboard.user;

import com.dashboard.constant.Daitv;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Swemsewak {

	private Long id;
	private String name;
	private Long contactNo;
	private String shaka;
	private String address;
	private int DOB;
	private Daitv daitiv;
	private String occupation;
	
}
