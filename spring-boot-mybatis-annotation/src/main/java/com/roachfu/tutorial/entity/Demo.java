package com.roachfu.tutorial.entity;

import java.io.Serializable;

/**
 * Demo实体类
 *
 * @author roach
 * @datetime 2017/11/1 14:46
 */
public class Demo implements Serializable{
    
    private Integer id;
    
    private String demoName;
    
    private String demoValue;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDemoName() {
        return demoName;
    }
    
    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }
    
    public String getDemoValue() {
        return demoValue;
    }
    
    public void setDemoValue(String demoValue) {
        this.demoValue = demoValue;
    }
}
