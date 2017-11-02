package com.roachfu.tutorial.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Demo实体类
 *
 * @author roach
 * @datetime 2017/11/1 14:46
 */
public class Demo implements Serializable{

    private static final long serialVersionUID = -6605419946999027600L;

    private Integer id;
    
    private String demoName;
    
    private String demoValue;

    private Integer demoStatus;

    private Date createTime;

    private Date updateTime;
    
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

    public Integer getDemoStatus() {
        return demoStatus;
    }

    public void setDemoStatus(Integer demoStatus) {
        this.demoStatus = demoStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
