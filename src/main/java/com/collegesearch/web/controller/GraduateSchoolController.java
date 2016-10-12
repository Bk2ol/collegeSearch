package com.collegesearch.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.collegesearch.domain.school.GraduateSchoolMajor;
import com.collegesearch.dto.GraduateSchoolMajorDetailDto;
import com.collegesearch.dto.GraduateSchoolMajorDto;
import com.collegesearch.service.GraduateSchoolService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.status.Status;



@Controller
//@Scope("session")
@RequestMapping("/graduateSchool")
public class GraduateSchoolController {
	@Autowired
	private GraduateSchoolService graduateSchoolService;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String GraduateSchool(Model model) {
		return "/graduateSchool/search";
	}
	
	
	
	
	@RequestMapping(value="/allGraduateSchools",method=RequestMethod.GET)
	public String allGraduateSchool(Model model) {
		return "/graduateSchool/AllGraduateSchoolList";
	}
	
	
	@RequestMapping(value="/searchGraduateSchoolMajor",method = RequestMethod.POST)
	@ResponseBody
	@Transactional
	public String searchSchoolMajorGraduateSchoolMajor(@RequestBody String JsonRequest, Model model) {
		List<GraduateSchoolMajor> resultList=null;
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
			resultList=graduateSchoolService.getGraduateSchoolMajors(queryParam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<GraduateSchoolMajorDto> outputList=convertGraduateSchoolMajorDtoList(resultList);
		
		
		String reponse=null;
		try {
			reponse = mapper.writeValueAsString(outputList);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(reponse);
		return reponse;
	}
	
	// helper method for web output format
	static List<GraduateSchoolMajorDto> convertGraduateSchoolMajorDtoList(List<GraduateSchoolMajor> list){
		List<GraduateSchoolMajorDto> resultList=new ArrayList<>();
		for(GraduateSchoolMajor item : list) {
			resultList.add(new GraduateSchoolMajorDto(item));
		}
		return resultList;
	}
	
	static List<GraduateSchoolMajorDetailDto> convertGraduateSchoolMajorDetailDtoList(List<GraduateSchoolMajor> list){
		List<GraduateSchoolMajorDetailDto> resultList=new ArrayList<>();
		for(GraduateSchoolMajor item : list) {
			resultList.add(new GraduateSchoolMajorDetailDto(item));
		}
		return resultList;
	}
	
	
	@RequestMapping(value="/searchGraduateSchoolMajorDetail",method = RequestMethod.POST)
	@ResponseBody
	@Transactional
	public String searchSchoolMajorGraduateSchoolMajorDetail(@RequestBody String JsonRequest, Model model) {
		List<GraduateSchoolMajor> resultList=null;
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
			resultList=graduateSchoolService.getGraduateSchoolMajors(queryParam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<GraduateSchoolMajorDetailDto> outputList=convertGraduateSchoolMajorDetailDtoList(resultList);
		
		
		String reponse=null;
		try {
			reponse = mapper.writeValueAsString(outputList);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(reponse);
		return reponse;
	}
}
