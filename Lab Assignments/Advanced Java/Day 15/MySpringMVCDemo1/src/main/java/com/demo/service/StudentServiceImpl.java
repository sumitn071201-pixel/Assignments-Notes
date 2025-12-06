package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyStudent;
import com.demo.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired   
	StudentDao pdao;

	public List<MyStudent> getAllStudents() {
		return pdao.findAllStudents();
	}

	@Override
	public boolean addstudent(MyStudent s) {
		return pdao.save(s);
		
	}

	@Override
	public MyStudent getById(int sid) {
		return pdao.findById(sid);
	}

	@Override
	public boolean updatestudent(MyStudent s) {
		return pdao.modifyStudent(s);
	}

	@Override
	public boolean deleteById(int sid) {
		return pdao.removeById(sid);
	}
}
