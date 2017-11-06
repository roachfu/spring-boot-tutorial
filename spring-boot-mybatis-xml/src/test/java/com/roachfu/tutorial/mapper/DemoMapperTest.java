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
import java.util.Date;
import java.util.List;

/**
 * @author fuqiang
 * @datetime 2017/11/1 15:28
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
        demo.setDemoName("roach name");
        demo.setDemoValue("roach value");
        demo.setId(1);
        int flag = demoMapper.insert(demo);
        Assert.assertEquals(flag, 1);
    }

    @Test
    public void testSelectList() {
        List<Demo> demoList = demoMapper.selectList();
        Assert.assertEquals(1, demoList.size());
    }

    @Test
    public void testSelectOne() {
        Demo demo = demoMapper.selectOne(1);
        Assert.assertEquals("roach name", demo.getDemoName());
        Assert.assertEquals("roach value", demo.getDemoValue());
    }

    @Test
    public void testUpdate() {
        Demo demo = new Demo();
        demo.setDemoName("crow name");
        demo.setDemoValue("crow value ");
        demo.setId(1);
        demo.setUpdateTime(new Date());
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