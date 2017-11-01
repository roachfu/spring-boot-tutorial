package com.roachfu.tutorial.mapper;

import com.roachfu.tutorial.entity.Demo;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fuqiang
 * @datetime 2017/11/1 15:00
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoMapperTest {
    @Resource
    private DemoMapper demoMapper;
    
    @Test
    public void testInsert() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setDemoName("roach");
        demo.setDemoValue("蟑螂");
        int flag = demoMapper.insert(demo);
        Assert.assertEquals(flag, 1);
    }
    
    @Test
    public void testList() {
        List<Demo> demoList = demoMapper.list();
        Assert.assertEquals(1, demoList.size());
    }
    
    @Test
    public void testSelectOne() {
        Demo demo = demoMapper.selectOne(1);
        Assert.assertEquals("roach", demo.getDemoName());
        Assert.assertEquals("蟑螂", demo.getDemoValue());
    }
    
    @Test
    public void testUpdate() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setDemoName("crow");
        demo.setDemoValue("乌鸦");
        int flag = demoMapper.update(demo);
        Assert.assertEquals(1, flag);
    }
    
    @Test
    public void testDelete() {
        int flag = demoMapper.delete(1);
        Assert.assertEquals(flag, 1);
        Demo demo = demoMapper.selectOne(1);
        Assert.assertEquals(demo, null);
    }
}