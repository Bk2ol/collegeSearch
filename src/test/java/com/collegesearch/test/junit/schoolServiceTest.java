package com.collegesearch.test.junit;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.collegesearch.domain.school.GraduateSchoolMajor;
import com.collegesearch.domain.school.School;
import com.collegesearch.dto.SchoolDto;
import com.collegesearch.service.SchoolService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application_context/collegeSearch-context.xml")
@Transactional
public class schoolServiceTest {
	@Autowired
	private SchoolService schoolService;
	
	@Test
	public void testGetSchoolByName(){
		System.out.println("*********testGetSchoolByName**************");
		String schoolName = "Brandman University";
		School s = schoolService.getSchoolByName(schoolName);
		System.out.println(s.getName() + "   "+ s.getState() + "   " + s.getRankOverall());
		System.out.println("*********testGetSchoolByName End**************");
	}
	
	@Test
	public void testGetSchools() {
		LinkedHashMap<String, List<String>> queryParams = new LinkedHashMap<>();
		List<String> stateList = new ArrayList<String>();
		stateList.add("MA");
		stateList.add("CA"); 
		List<String> topRank = new ArrayList<>();
		topRank.add("100");
		List<String> botRank = new ArrayList<>();
		botRank.add("56");
		queryParams.put("topRank", topRank);
		queryParams.put("bottomRank", botRank);
		queryParams.put("state",stateList);
		List<School> result = schoolService.getSchools(queryParams);
		System.out.println("*********testGetSchools**************    "+result.size()+"found");
		for(School s : result) {
			System.out.println(s.getName() + "   "+ s.getState() + "   " + s.getRankOverall()+s.getInternationalStudentApplication().getToeflAcceptedInsteadOfSatOrAct());
		}
		System.out.println("*********testGetSchools End**************");
	}

}
