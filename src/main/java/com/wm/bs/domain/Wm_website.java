package com.wm.bs.domain;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

/** 
 * Project Name:BrowserServer 
 * File Name:Wm_website.java 
 * Package Name:com.wm.bs.domain 
 * Date:2013-3-12下午3:56:52 
 * Copyright (c) 2013, andy.zh1215@gmail.com All Rights Reserved. 
 * 
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Wm_website {

    @NotNull
    @Size(max = 255)
    private String ww_name;

    @NotNull
    @Size(max = 255)
    private String username_v;

    @NotNull
    @Size(max = 255)
    private String password_v;

    @Size(max = 20)
    private String submit_p;

    @NotNull
    private Boolean is_active;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date mtime;
    
    public static Wm_website findWm_website_byname(String ww_name) {
        if (ww_name == null) return null;
        return entityManager().createQuery("SELECT o FROM Wm_website o where o.ww_name =?1 and o.is_active =true", Wm_website.class).setParameter(1,ww_name).getSingleResult();
    }
}
