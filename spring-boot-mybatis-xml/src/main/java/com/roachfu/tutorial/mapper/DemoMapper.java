package com.roachfu.tutorial.mapper;

import com.roachfu.tutorial.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fuqiang
 * @datetime 2017/11/1 15:16
 */

@Mapper
public interface DemoMapper {
    
    /**
     * 获取demo的所有列表
     * @return
     */
    List<Demo> selectList();
    
    /**
     * 根据id查询一条记录
     * @param id 主键id
     * @return 一条记录
     */
    Demo selectOne(@Param("id") Integer id);
    
    /**
     *  插入一条新数据
     * @param demo 数据
     * @return 0|1
     */
    int insert(Demo demo);
    
    /**
     * 更新一条数据
     * @param demo 更新数据
     * @return 0|1
     */
    int update(Demo demo);
    
    /**
     * 根据id删除一条记录
     * @param id 主键id
     * @return 0|1
     */
    int delete(@Param("id") Integer id);
}
