package com.collegesearch.dao.school;

import java.util.List;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.ASchoolForBStudent;

public interface ASchoolForBStudentDao extends GenericDao<ASchoolForBStudent, Integer>{
   public List<ASchoolForBStudent> getAllASchoolForBStudent();
}