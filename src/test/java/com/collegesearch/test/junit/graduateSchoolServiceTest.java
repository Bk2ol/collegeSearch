package com.collegesearch.test.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.collegesearch.domain.school.GraduateMajor;
import com.collegesearch.domain.school.GraduateSchoolMajor;
import com.collegesearch.service.GraduateSchoolService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application_context/collegeSearch-context.xml")
@Transactional
public class graduateSchoolServiceTest {

	@Autowired
	private GraduateSchoolService graduateSchoolService;
	
	@Test
	public void testGetGraduateMajorByName() {
		String name="Computer Science";
		GraduateMajor major=graduateSchoolService.getGraduateMajorByName(name);
		assertNotNull(major);
		assertEquals(name, major.getName());
		System.out.println("major is " +major.getId() + "  "+ major.getName());
	}
	
	@Test
	public void testGetGraduateSchoolMajors() {
		LinkedHashMap<String, List<String>> queryParams=new LinkedHashMap<>();
		List<String> stateList=new ArrayList<String>();
		stateList.add("MA");
		stateList.add("CA");
		
		List<String> degreeList=new ArrayList<String>();
		degreeList.add("PHD");
		
		List<String> rankList=new ArrayList<>();
		rankList.add("1");
		rankList.add("25");
		
		List<String> majorList=new ArrayList<>();
		majorList.add("Biological Sciences");
		majorList.add("Computer Science");
		
		queryParams.put("majorName", majorList);
		queryParams.put("rank",rankList);
		queryParams.put("degree",degreeList);
		queryParams.put("state",stateList);

		List<GraduateSchoolMajor> result=graduateSchoolService.getGraduateSchoolMajors(queryParams);
		System.out.println("***********************    "+result.size()+" found");
		for(GraduateSchoolMajor g : result) {
			System.out.println(g.getSchool().getName()+"  "+g.getGraduateMajor().getName()+"   "+g.getEmail()+" "+g.getRank());
		}

	}

}
