package com.collegesearch.dao.school;

import org.hibernate.Session;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.Major;

public interface MajorDao extends GenericDao<Major, String>{
  
  public Major getMajorById(String id);
  public Major getMajorByName(String name);
  public Major getMajorByName(String name, Session session);
}