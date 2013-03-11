// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.wm.bs.domain;

import com.wm.bs.domain.Wm_web_login;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Wm_web_login_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Wm_web_login.entityManager;
    
    public static final EntityManager Wm_web_login.entityManager() {
        EntityManager em = new Wm_web_login().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Wm_web_login.countWm_web_logins() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Wm_web_login o", Long.class).getSingleResult();
    }
    
    public static List<Wm_web_login> Wm_web_login.findAllWm_web_logins() {
        return entityManager().createQuery("SELECT o FROM Wm_web_login o", Wm_web_login.class).getResultList();
    }
    
    public static Wm_web_login Wm_web_login.findWm_web_login(Long id) {
        if (id == null) return null;
        return entityManager().find(Wm_web_login.class, id);
    }
    
    public static List<Wm_web_login> Wm_web_login.findWm_web_loginEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Wm_web_login o", Wm_web_login.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Wm_web_login.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Wm_web_login.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Wm_web_login attached = Wm_web_login.findWm_web_login(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Wm_web_login.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Wm_web_login.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Wm_web_login Wm_web_login.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Wm_web_login merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
