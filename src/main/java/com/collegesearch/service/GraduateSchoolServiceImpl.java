package com.collegesearch.service;

import java.util.LinkedHashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegesearch.dao.school.GraduateMajorDao;
import com.collegesearch.dao.school.GraduateSchoolMajorDao;
import com.collegesearch.domain.school.GraduateMajor;
import com.collegesearch.domain.school.GraduateSchoolMajor;

@Service("GraduateSchoolService")
@Transactional
public class GraduateSchoolServiceImpl implements GraduateSchoolService{
	@Autowired
	SessionFactory sessionFactory;
	
//	@Autowired
//	SchoolDao schoolDao;
	
	@Autowired
	GraduateSchoolMajorDao graduateSchoolMajorDao;
	
	@Autowired
	GraduateMajorDao graduateMajorDao;
	
  public GraduateMajor getGraduateMajorById(String id) {
	  return graduateMajorDao.getGraduateMajorById(id);
  }
  
  public GraduateMajor getGraduateMajorByName(String name) {
	  return graduateMajorDao.getGraduateMajorByName(name);
  }
  
  public GraduateMajor getGraduateMajorByName(String name, Session session) {
	  return graduateMajorDao.getGraduateMajorByName(name);
  }
  
  public List<GraduateSchoolMajor> getGraduateSchoolMajors(LinkedHashMap<String, List<String>> queryParams){
	  return graduateSchoolMajorDao.getGraduateSchoolMajors(queryParams);
  }
}
