package com.wm.bs.domain;

import java.util.Date;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Wm_web_login {

    @ManyToOne
    private Wm_website ww_id;

    @NotNull
    @Size(max = 255)
    private String ww_name;

    @NotNull
    @Size(max = 255)
    private String username;

    @NotNull
    @Size(max = 255)
    private String password;

    @NotNull
    private Boolean is_used;

    @NotNull
    private Boolean is_active;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date mtime;
    
    public static Wm_web_login findWm_web_login_byname(String ww_name) {
        if (ww_name == null) return null;
        return entityManager().createQuery("SELECT o FROM Wm_web_login o where o.ww_name =?1 and o.is_active =?2", Wm_web_login.class).setParameter(1,ww_name).setParameter(2,true).setFirstResult(0).setMaxResults(1).getSingleResult();
    }
}
