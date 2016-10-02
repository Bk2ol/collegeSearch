package com.collegesearch.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.collegesearch.domain.school.GraduateSchoolMajor;
import com.collegesearch.domain.school.School;
import com.collegesearch.dto.GraduateSchoolMajorDto;
import com.collegesearch.dto.SchoolDetailDto;
import com.collegesearch.dto.SchoolDto;
import com.collegesearch.service.SchoolService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public String School(Model model) {
		return "/school/search";
	}
	
	@RequestMapping(value="/searchSchools",method = RequestMethod.POST)
	@ResponseBody
	@Transactional
	public String searchSchoolMajorGraduateSchoolMajor(@RequestBody String JsonRequest, Model model) {
		List<School> resultList=null;
		ObjectMapper mapper = new ObjectMapper();
		LinkedHashMap<String, List<String>> queryParam=null;
		try {
			queryParam = (LinkedHashMap<String, List<String>>) mapper.readValue(JsonRequest,Map.class);
		} catch (JsonParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		Set set = queryParam.entrySet();
//	      // Get an iterator
//	      Iterator i = set.iterator();
//	      // Display elements
//	      while(i.hasNext()) {
//	         Map.Entry me = (Map.Entry)i.next();
//	      }
		
		try {
			resultList=schoolService.getSchools(queryParam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<SchoolDto> outputList=convertSchoolDtoList(resultList);
		
		String reponse=null;
		try {
			reponse = mapper.writeValueAsString(outputList);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reponse;
	}
	
//	@RequestMapping(value="/searchSchoolByName/{schoolName}",method = RequestMethod.GET)
//	@ResponseBody
//	@Transactional
//	public String searchSchool(@PathVariable String schoolName, Model model) {
//		System.out.println("*****************school name***************");
//		System.out.println(schoolName);
//		System.err.println("*****************school name***************");
//		School searchedSchool=null;
//		ObjectMapper mapper = new ObjectMapper();
//		try {
//			searchedSchool = schoolService.getSchoolByName(schoolName);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		SchoolDetailDto searchedSchoolDetailDto = new SchoolDetailDto(searchedSchool);
//		
//		String reponse=null;
//		try {
//			reponse = mapper.writeValueAsString(searchedSchoolDetailDto);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//return reponse;
//		return "redirect:/school/schoolInDetail";
//	}
	@RequestMapping(value="/searchSchoolByName/{schoolName}",method = RequestMethod.GET)
	@ResponseBody
	@Transactional
	public ModelAndView searchSchool(@PathVariable String schoolName, Model model) {
		System.out.println("*****************school name***************");
		System.out.println(schoolName);
		System.err.println("*****************school name***************");
		School searchedSchool=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			searchedSchool = schoolService.getSchoolByName(schoolName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SchoolDetailDto searchedSchoolDetailDto = new SchoolDetailDto(searchedSchool);
		
		String reponse=null;
		try {
			reponse = mapper.writeValueAsString(searchedSchoolDetailDto);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(reponse);
		//return reponse;
		ModelAndView modelAndView = new ModelAndView("/school/schoolInDetail");
		
		modelAndView.addObject("schoolDetail", reponse);
		return modelAndView;
	}
	// helper method for web output format
	static List<SchoolDto> convertSchoolDtoList(List<School> list){
		List<SchoolDto> resultList=new ArrayList<>();
		for(School item : list) {
			resultList.add(new SchoolDto(item));
		}
		return resultList;
	}
}
