package com.roachfu.tutorial.mapper;

import com.roachfu.tutorial.entity.Demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fuqiang
 * @datetime 2017/11/1 15:28
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMapperTest {
    
    @Resource
    private DemoMapper demoMapper;
    
    @Test
    public void testSelectList(){
        List<Demo> demoList = demoMapper.selectList();
        Assert.assertEquals(1, demoList.size());
    }
}