package com.collegesearch.dao.school;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.GraduateMajor;

@Repository("graduateMajorDao")
public class GraduateMajorDaoImpl extends GenericDaoImpl<GraduateMajor, String> implements GraduateMajorDao{
	
	  @Override
	  public GraduateMajor getGraduateMajorById(String id) {
		  List<GraduateMajor> list=findByParameter("id", id);
		  if(list != null && !list.isEmpty())
			  return list.get(0);
		   else return null;
	  }
	  
	  @Override
	  public GraduateMajor getGraduateMajorByName(String name) {
		  List<GraduateMajor> list=findByParameter("name", name);
		  if(list != null && !list.isEmpty())
			  return list.get(0);
		  else return null;
	  }
	  
	  @Override
	  public GraduateMajor getGraduateMajorByName(String name, Session session) {
		  List<GraduateMajor> list=findByParameter("name", name);
		  if(list != null && !list.isEmpty())
			  return list.get(0);
		  else return null;
	  }
}
