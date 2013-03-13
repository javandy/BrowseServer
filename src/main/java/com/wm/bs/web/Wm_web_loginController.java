package com.wm.bs.web;

import com.wm.bs.domain.Wm_web_login;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * Project Name:BrowserServer 
 * File Name:Wm_web_loginController.java 
 * Package Name:com.wm.bs.web 
 * Date:2013-3-12下午3:57:13 
 * Copyright (c) 2013, andy.zh1215@gmail.com All Rights Reserved. 
 * 
 */
@RequestMapping("/wm_web_logins")
@Controller
@RooWebScaffold(path = "wm_web_logins", formBackingObject = Wm_web_login.class)
@RooWebJson(jsonObject = Wm_web_login.class)
public class Wm_web_loginController {
	
	@RequestMapping(value = "/{ww_name}/", headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> showJson(@PathVariable("ww_name") String ww_name) {
        Wm_web_login wm_web_login = Wm_web_login.findWm_web_login_byname(ww_name);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        if (wm_web_login == null) {
            return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>(wm_web_login.toJson(), headers, HttpStatus.OK);
    }
}
