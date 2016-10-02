package com.collegesearch.dao.school;

import org.hibernate.Session;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.GraduateMajor;


public interface GraduateMajorDao extends GenericDao<GraduateMajor, String>{
	  public GraduateMajor getGraduateMajorById(String id);
	  public GraduateMajor getGraduateMajorByName(String name);
	  public GraduateMajor getGraduateMajorByName(String name, Session session);
}
