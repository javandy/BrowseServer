package com.wm.bs.web;

import javax.servlet.http.HttpServletRequest;

import com.wm.bs.domain.Wm_log;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * Project Name:BrowserServer 
 * File Name:Wm_logController.java 
 * Package Name:com.wm.bs.web 
 * Date:2013-3-12下午3:57:05 
 * Copyright (c) 2013, andy.zh1215@gmail.com All Rights Reserved. 
 * 
 */
@RequestMapping("/wm_logs")
@Controller
@RooWebScaffold(path = "wm_logs", formBackingObject = Wm_log.class)
@RooWebJson(jsonObject = Wm_log.class)
public class Wm_logController {
    @RequestMapping(value="/post", method = RequestMethod.POST, headers = "Accept=application/json")
    public @ResponseBody String createFromJson(@RequestBody String json,HttpServletRequest request) {
    	try{
    	String ip = request.getRemoteHost();
    	Wm_log wm_log = Wm_log.fromJsonToWm_log(json);
    	wm_log.setIp(ip);
        wm_log.persist();
        return "Saved!";
    	}	
    	catch(Exception e)
        {
        	return "Save Failed!";
        	}

    }
}
