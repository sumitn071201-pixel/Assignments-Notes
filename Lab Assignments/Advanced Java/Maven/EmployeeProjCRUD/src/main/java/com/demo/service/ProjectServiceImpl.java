package com.demo.service;

import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;
import com.demo.entity.Employee;
import com.demo.entity.Project;

import net.bytebuddy.asm.Advice.Local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProjectServiceImpl implements ProjectService{
	private ProjectDao pDao ;
	
	public ProjectServiceImpl() {
		pDao = new ProjectDaoImpl();
	}

	@Override
	public Boolean registerNewProject() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter project name");
			String name = sc.next();
			System.out.println("Enter start date of project (dd/mm/yyyy) format");
			String dt = sc.next();
			LocalDate startDate = LocalDate.parse(dt , DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			Project p = new Project(name , startDate);
			return pDao.save(p);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public Project findEmpById(int id) {
		return pDao.findById(id);
	}

	@Override
	public List<Employee> findAllEmpByProjectId(int id) {
		return pDao.findAllEmpId(id);
	}

	@Override
	public List<Project> findAllProjects() {
		return pDao.findAll();
	}
}
