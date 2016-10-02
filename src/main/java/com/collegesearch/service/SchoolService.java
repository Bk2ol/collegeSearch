package com.collegesearch.service;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.collegesearch.domain.school.School;
import com.collegesearch.dto.SchoolDto;

@Service
public interface SchoolService {
	public School getSchoolByName(String schoolName);  
	public School getSchoolByName(Session session, String name);
	public List<School> getSchools(LinkedHashMap<String, List<String>> queryParams);
}
