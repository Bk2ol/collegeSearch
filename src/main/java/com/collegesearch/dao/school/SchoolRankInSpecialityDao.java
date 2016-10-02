package com.collegesearch.dao.school;

import java.util.List;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.SchoolRankInSpeciality;

public interface SchoolRankInSpecialityDao extends GenericDao<SchoolRankInSpeciality, Integer>{
  
  public List<SchoolRankInSpeciality> getSchoolRankInSpecialityBySpeciality(String speciality);
   
}