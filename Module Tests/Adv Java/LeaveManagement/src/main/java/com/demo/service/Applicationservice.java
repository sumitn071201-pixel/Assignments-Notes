package com.demo.service;

import java.util.List;

import com.demo.dto.LeaveDto;

public interface Applicationservice {

	List<LeaveDto> getAllLeaves();

	static boolean addLeave(LeaveDto l) {
		
		return false;
	}


  
}
