package com.collegesearch.dao.school;

import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Session;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.School;
import com.collegesearch.dto.SchoolDto;

public interface SchoolDao extends GenericDao<School, Integer>{
	  public School getSchoolByName(String schoolName);  
	  public School getSchoolByName(Session session, String name);
	  public List<School> getSchools(LinkedHashMap<String, List<String>> queryParams);
}