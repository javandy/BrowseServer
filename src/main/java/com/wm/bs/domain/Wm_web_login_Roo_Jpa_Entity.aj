// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.wm.bs.domain;

import com.wm.bs.domain.Wm_web_login;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Wm_web_login_Roo_Jpa_Entity {
    
    declare @type: Wm_web_login: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Wm_web_login.id;
    
    @Version
    @Column(name = "version")
    private Integer Wm_web_login.version;
    
    public Long Wm_web_login.getId() {
        return this.id;
    }
    
    public void Wm_web_login.setId(Long id) {
        this.id = id;
    }
    
    public Integer Wm_web_login.getVersion() {
        return this.version;
    }
    
    public void Wm_web_login.setVersion(Integer version) {
        this.version = version;
    }
    
}
