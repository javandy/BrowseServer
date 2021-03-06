// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.wm.bs.domain;

import com.wm.bs.domain.Wm_log;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Wm_log_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Wm_log.entityManager;
    
    public static final EntityManager Wm_log.entityManager() {
        EntityManager em = new Wm_log().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Wm_log.countWm_logs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Wm_log o", Long.class).getSingleResult();
    }
    
    public static List<Wm_log> Wm_log.findAllWm_logs() {
        return entityManager().createQuery("SELECT o FROM Wm_log o", Wm_log.class).getResultList();
    }
    
    public static Wm_log Wm_log.findWm_log(Long id) {
        if (id == null) return null;
        return entityManager().find(Wm_log.class, id);
    }
    
    public static List<Wm_log> Wm_log.findWm_logEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Wm_log o", Wm_log.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Wm_log.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Wm_log.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Wm_log attached = Wm_log.findWm_log(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Wm_log.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Wm_log.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Wm_log Wm_log.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Wm_log merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
