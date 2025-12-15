package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.beans.leaveApplication;
import com.demo.controller.LeaveApplication;
import com.demo.dao.LeaveDao;
import com.demo.dto.LeaveDto;
import com.demo.mapper.LeaveDtoMapper;


@Service
public class LeaveServiceImpl implements Applicationservice{
    @Autowired   
	LeaveDao ldao;
	
	public boolean addLeave(LeaveDto l) {
		
		leaveApplication lv=LeaveDtoMapper.mapToLeave(l);
		return ldao.save(lv);
		
	}


	@Override
	public List<LeaveDto> getAllLeaves() {
		List<LeaveApplication> llist= ldao.findAllLeaves();
		List<LeaveDto> llist1=llist.stream()
				.map(lv->LeaveDtoMapper.mapToLeaveDto(lv))
				.collect(Collectors.toList());
		return llist1;
	}





	
}
