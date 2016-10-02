package com.collegesearch.dao.school;

import java.util.List;

import org.hibernate.Session;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.BestSchoolMajor;
import com.collegesearch.domain.school.Major;


public interface BestSchoolMajorDao extends GenericDao<BestSchoolMajor, String>{
  
   public List<BestSchoolMajor> getBestSchoolMajorsByMajorId(String majorId);
   public List<BestSchoolMajor> getBestSchoolMajorsByMajorId(String majorId, Session session);
  
}