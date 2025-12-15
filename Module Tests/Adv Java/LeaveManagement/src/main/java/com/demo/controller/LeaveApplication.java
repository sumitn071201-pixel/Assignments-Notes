package com.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.dto.LeaveDto;
import com.demo.service.Applicationservice;

public class LeaveApplication {

	public List<LeaveDto> getAllLeaves() {
		// TODO Auto-generated method stub
		return null;
	}
	@PostMapping("/leaveapplications/{leaveid}")
	public ResponseEntity<String> addLeave(@RequestBody LeaveDto p){
		boolean status=Applicationservice.addLeave(p);
		if(status) {
			return ResponseEntity.ok("data added successfully");
		}else {
			return ResponseEntity.ok("Error occured");
		}
		
	}
}
