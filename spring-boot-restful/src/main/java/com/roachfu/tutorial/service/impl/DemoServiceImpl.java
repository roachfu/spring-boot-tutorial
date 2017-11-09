package com.roachfu.tutorial.service.impl;

import com.roachfu.tutorial.entity.Demo;
import com.roachfu.tutorial.mapper.DemoMapper;
import com.roachfu.tutorial.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author roach
 * @date 06/11/2017 22:56
 */

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<Demo> getList() {
        return demoMapper.selectList();
    }

    @Override
    public Demo getOne(Integer id) {
        return demoMapper.selectOne(id);
    }

    @Override
    public int save(Demo demo) {
        return demoMapper.insert(demo);
    }

    @Override
    public int update(Demo demo) {
        return demoMapper.update(demo);
    }

    @Override
    public int delete(Integer id) {
        return demoMapper.delete(id);
    }
}
