package com.collegesearch.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.collegesearch.domain.school.GraduateMajor;
import com.collegesearch.domain.school.GraduateSchoolMajor;

@Service
public interface GraduateSchoolService {
	  public GraduateMajor getGraduateMajorById(String id);
	  public GraduateMajor getGraduateMajorByName(String name);
	  public GraduateMajor getGraduateMajorByName(String name, Session session);
	  public List<GraduateSchoolMajor> getGraduateSchoolMajors(LinkedHashMap<String, List<String>> queryParams);
}
