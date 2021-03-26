package com.yuyan.springboot_test.dao;

import com.yuyan.springboot_test.pojo.Teacher2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    Teacher2 getteacher(int id);

    Teacher2 getteacherbyid(int id);

}
