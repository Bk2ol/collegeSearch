package com.collegesearch.dao.school;

import java.util.LinkedHashMap;
import java.util.List;

import com.collegesearch.dao.GenericDao;
import com.collegesearch.domain.school.GraduateSchoolMajor;
import com.collegesearch.domain.school.GraduateSchoolMajorId;

public interface GraduateSchoolMajorDao extends GenericDao<GraduateSchoolMajor, GraduateSchoolMajorId> {
	public List<GraduateSchoolMajor> getGraduateSchoolMajors(LinkedHashMap<String, List<String>> queryParams);
}
