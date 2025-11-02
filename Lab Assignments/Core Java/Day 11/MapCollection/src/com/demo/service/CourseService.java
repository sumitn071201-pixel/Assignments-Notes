package com.demo.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Integer> displayAll();

	int searchByName(String cname);

	boolean modifyByName(String cname, int newcap);

	Set<String> displayByCapacity(int capacity);

	boolean modifyCourseName(String oname, String nname);

	Map<String, Integer> sortByNmae();

	Set<Entry<String, Integer>> sortByCapacity();

	boolean deleteByName(String cname);

	boolean deleteByCapacity(int capacity);

}
