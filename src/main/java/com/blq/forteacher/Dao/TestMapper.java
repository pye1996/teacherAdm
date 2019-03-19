package com.blq.forteacher.Dao;

import com.blq.forteacher.Entity.KeepLesson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper{
    List<KeepLesson> hello()throws Exception;
}
