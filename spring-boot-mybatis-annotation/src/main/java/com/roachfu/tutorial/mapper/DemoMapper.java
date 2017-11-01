package com.roachfu.tutorial.mapper;

import com.roachfu.tutorial.entity.Demo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * demo dao层
 *
 * @author roach
 * @datetime 2017/11/1 14:47
 */

@Mapper
public interface DemoMapper {
    
    /**
     * 获取demo的所有列表
     *
     * @return
     */
    @Select("select * from t_demo")
    @Results({
            @Result(property = "demoName", column = "demo_name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "demoValue", column = "demo_value", jdbcType = JdbcType.VARCHAR)
    })
    List<Demo> list();
    
    /**
     * 根据id查询一条记录
     *
     * @param id 主键id
     * @return 一条记录
     */
    @Select("select id, demo_name, demo_value from t_demo where id = #{id}")
    Demo selectOne(@Param("id") Integer id);
    
    /**
     * 插入一条新数据
     *
     * @param demo 数据
     * @return 0|1
     */
    @Insert("insert into t_demo(id, demo_name, demo_value) values (#{id}, #{demoName}, #{demoValue})")
    int insert(Demo demo);
    
    /**
     * 更新一条数据
     *
     * @param demo 更新数据
     * @return 0|1
     */
    @Update("update t_demo set demo_name = #{demoName}, demo_value=#{demoValue}")
    int update(Demo demo);
    
    /**
     * 根据id删除一条记录
     *
     * @param id 主键id
     * @return 0|1
     */
    @Delete("delete from t_demo where id = #{id}")
    int delete(@Param("id") Integer id);
}
