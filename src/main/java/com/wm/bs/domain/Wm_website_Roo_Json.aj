// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.wm.bs.domain;

import com.wm.bs.domain.Wm_website;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect Wm_website_Roo_Json {
    
    public String Wm_website.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Wm_website Wm_website.fromJsonToWm_website(String json) {
        return new JSONDeserializer<Wm_website>().use(null, Wm_website.class).deserialize(json);
    }
    
    public static String Wm_website.toJsonArray(Collection<Wm_website> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Wm_website> Wm_website.fromJsonArrayToWm_websites(String json) {
        return new JSONDeserializer<List<Wm_website>>().use(null, ArrayList.class).use("values", Wm_website.class).deserialize(json);
    }
    
}
