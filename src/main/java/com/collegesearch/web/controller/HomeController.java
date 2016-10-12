package com.collegesearch.web.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




/**
* This MVC controller class takes all ims-related requests and dispatches the requests to corresponding services to fulfill database CRUD operations on ims.
* This class handles all requests rooted with "/ims".
*
*/

@Controller
@RequestMapping("/")
public class HomeController {

	   //--------------------------- Home Page --------------------------// 
	   
	  /**
        * This method is used to show the form to search Schools
	    *
	    * @return Main Applicant home page
	    *
	    */
    	@RequestMapping(value = "", method = RequestMethod.GET)
    	public String showWelcome(Model model) {
    		//model.addAttribute("school", new School());	
    		return "/home";
    	}	
    	@RequestMapping(value = "/GTExperience", method = RequestMethod.GET)
    	public String showTestExperience(Model model) {
    		return "/other/applicationTest";
    	}
    	@RequestMapping(value = "/aboutMe", method = RequestMethod.GET)
    	public String showSelfIntroduction(Model model) {
    		return "/other/aboutMe";
    	}
    	
    	@RequestMapping(value = "/goHTTP/**")
        public  String redirect(HttpServletRequest httpServletRequest) throws UnsupportedEncodingException {
    		System.out.println("*******mapping success***************");
    		String URL = httpServletRequest.getRequestURI();
    		URL = URL.substring(URL.lastIndexOf("goHTTP/")+7);
    		System.out.println(URL);
    		String string = URLDecoder.decode(URL, "UTF-8");
    		System.out.println("decode " + string);
    		if(!string.startsWith("http")) {
    			
    			string = "http://" + string;
    		}
    		System.out.println("fincal "+string);
    		return "redirect:" + string;
    		
        }
    	
	}
