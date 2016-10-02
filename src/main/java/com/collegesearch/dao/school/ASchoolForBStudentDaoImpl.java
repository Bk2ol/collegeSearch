/**
 * 
 */
package com.collegesearch.dao.school;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.ASchoolForBStudent;

@Repository("aSchoolForBStudentDao")
public class ASchoolForBStudentDaoImpl extends GenericDaoImpl<ASchoolForBStudent, Integer> implements ASchoolForBStudentDao {

	@Override
	public List<ASchoolForBStudent> getAllASchoolForBStudent() {
		return (List<ASchoolForBStudent>)findAll();
	}
}
