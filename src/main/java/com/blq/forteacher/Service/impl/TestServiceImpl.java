package com.blq.forteacher.Service.impl;

import com.blq.forteacher.Dao.TestMapper;
import com.blq.forteacher.Entity.KeepLesson;
import com.blq.forteacher.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<KeepLesson> hello()throws Exception{
        return testMapper.hello();
    }
}
