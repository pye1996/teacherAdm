package com.blq.forteacher.Dao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface KeepLessonMapper {
    @Insert("insert into keep_lesson(name,image,typeid) values (#{name},#{image},#{typeid})")
    int addLesson(@Param("name") String name,@Param("image") String image,@Param("typeid") int typeid);
}
