package com.blq.forteacher.Service.impl;

import com.blq.forteacher.Dao.KeepLessonMapper;
import com.blq.forteacher.Service.KeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeepServiceImpl implements KeepService {
    @Autowired
    private KeepLessonMapper keepLessonMapper;

    @Override
    public int addLesson(String name,String image,int typeid){
        return keepLessonMapper.addLesson(name,image,typeid);
    }
}
