package com.wm.bs.web;

import com.wm.bs.domain.Wm_website;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * Project Name:BrowserServer 
 * File Name:Wm_websiteController.java 
 * Package Name:com.wm.bs.web 
 * Date:2013-3-12下午3:58:01 
 * Copyright (c) 2013, andy.zh1215@gmail.com All Rights Reserved. 
 * 
 */
@RequestMapping("/wm_websites")
@Controller
@RooWebScaffold(path = "wm_websites", formBackingObject = Wm_website.class)
@RooWebJson(jsonObject = Wm_website.class)
public class Wm_websiteController {	
	@RequestMapping(value="/{ww_name}/", method=RequestMethod.GET)
	public @ResponseBody String showJson(@PathVariable("ww_name") String ww_name) {
		 Wm_website wm_website = Wm_website.findWm_website_byname(ww_name);
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Type", "application/json; charset=utf-8");
	        if (wm_website == null) {
	            return null;
	        }
	        return wm_website.toJson();
	}
}
