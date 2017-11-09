package com.roachfu.tutorial.service;

import com.roachfu.tutorial.entity.Demo;

import java.util.List;

/**
 * @author roach
 * @date 06/11/2017 22:56
 */
public interface DemoService {

    /**
     * 获取列表
     * @return
     */
    List<Demo> getList();

    /**
     * 根据id获取单条记录
     * @return
     */
    Demo getOne(Integer id);

    /**
     * 保存记录
     * @param demo
     * @return
     */
    int save(Demo demo);

    /**
     * 根据id更新记录
     * @param demo
     * @return
     */
    int update(Demo demo);

    /**
     * 根据id删除一条记录
     * @param id
     * @return
     */
    int delete(Integer id);
}
