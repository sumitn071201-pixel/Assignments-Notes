package com.demo.dao;

import java.util.List;

import com.demo.beans.leaveApplication;
import com.demo.controller.LeaveApplication;

public interface LeaveDao {

	List<LeaveApplication> findAllLeaves();

	boolean save(leaveApplication lv);

}
