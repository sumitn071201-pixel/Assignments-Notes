package com.demo.mapper;


import com.demo.beans.leaveApplication;
import com.demo.controller.LeaveApplication;
import com.demo.dto.LeaveDto;


public class LeaveDtoMapper {

	public static leaveApplication mapToLeave(LeaveDto l) {
		
		return new leaveApplication();
	}
	
	public static LeaveDto mapToLeaveDto(LeaveApplication lv) {
		return null;


	}
}
