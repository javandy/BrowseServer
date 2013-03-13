
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
 * File Name:Wm_log.java 
 * Package Name:com.wm.bs.domain 
 * Date:2013-3-12下午3:56:23 
 * Copyright (c) 2013, andy.zh1215@gmail.com All Rights Reserved. 
 * 
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Wm_log {

    @Size(max = 16)
    private String ip;

    @NotNull
    @Size(max = 255)
    private String website;

    @NotNull
    @Size(max = 255)
    private String username;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date btime;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date etime;
}
