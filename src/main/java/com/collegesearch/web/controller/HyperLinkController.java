package com.collegesearch.web.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/aaaaa")
public class HyperLinkController {
	@RequestMapping(value = "/**")
    public  String redirect(HttpServletRequest httpServletRequest) throws UnsupportedEncodingException {
		System.out.println("*******mapping success***************");
		String URL = httpServletRequest.getRequestURI();
		URL = URL.substring(URL.lastIndexOf("goHTTP/")+7);
		System.out.println(URL);
		String string = URLDecoder.decode(URL, "UTF-8");
		System.out.println("decode " + string);
		if(!string.startsWith("http://")) {
			
			string = "http://" + string;
		}
		System.out.println("fincal "+string);
		return "redirect:" + string;
		
    }
}
