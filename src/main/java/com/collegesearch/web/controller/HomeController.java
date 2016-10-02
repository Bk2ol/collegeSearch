package com.collegesearch.web.controller;

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

	}
