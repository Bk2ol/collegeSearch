package com.collegesearch.dao.school;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.BestSchoolMajor;
import com.collegesearch.domain.school.Major;


@Repository("bestSchoolMajorDao")
public class BestSchoolMajorDaoImpl extends GenericDaoImpl<BestSchoolMajor, String> implements BestSchoolMajorDao {
	
	@Override
	//@Transactional(readOnly=true, propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	public List<BestSchoolMajor> getBestSchoolMajorsByMajorId(String majorId){
		return findByParameter("id.majorId", majorId);
	}
	
	@Override
	//@Transactional(readOnly=true, propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	public List<BestSchoolMajor> getBestSchoolMajorsByMajorId(String majorId, Session session){
		return findByParameter("id.majorId", majorId, session);
	}	
}
