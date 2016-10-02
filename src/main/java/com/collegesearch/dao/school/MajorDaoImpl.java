package com.collegesearch.dao.school;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.Major;


@Repository("majorDao")
public class MajorDaoImpl extends GenericDaoImpl<Major, String> implements MajorDao {
						
	@Override
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	public Major getMajorById(String majorId){
	   List<Major> majorList = findByParameter("id.majorId", majorId);
	   if(majorList != null && majorList.size()>0)
		  return majorList.get(0); 
	   else
		  return null;
	}
	
	@Override
	//@Transactional(readOnly=true, propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	public Major getMajorByName(String name){
		List<Major> majorList = findByParameter("name", name);
	    if(majorList != null && majorList.size()>0)
		   return majorList.get(0); 
		else
		   return null;
	}
	
	@Override
	//@Transactional(readOnly=true, propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	public Major getMajorByName(String name, Session session){
		List<Major> majorList = findByParameter("name", name);
	    if(majorList != null && majorList.size()>0)
		   return majorList.get(0); 
		else
		   return null;
	}

}
