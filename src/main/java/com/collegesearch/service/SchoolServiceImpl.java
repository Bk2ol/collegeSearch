package com.collegesearch.service;

import java.util.LinkedHashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegesearch.dao.school.SchoolDao;
import com.collegesearch.domain.school.School;
import com.collegesearch.dto.SchoolDto;

@Service("SchoolService")
@Transactional
public class SchoolServiceImpl implements SchoolService{
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	SchoolDao schoolDao;
	
	public School getSchoolByName(String schoolName) {
		return schoolDao.getSchoolByName(schoolName);
	}
	public School getSchoolByName(Session session, String schoolName) {
		return schoolDao.getSchoolByName(schoolName);
	}
	public List<School> getSchools(LinkedHashMap<String, List<String>> queryParams){
		List<School> result = schoolDao.getSchools(queryParams);
		return result;
	}
	
}
