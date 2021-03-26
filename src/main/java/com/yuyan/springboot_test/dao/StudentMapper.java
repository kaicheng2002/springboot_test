package com.yuyan.springboot_test.dao;

import com.yuyan.springboot_test.pojo.Student;
import com.yuyan.springboot_test.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> getStudentAll();

    List<Teacher> getTeacherAll();

    List<Student> getStudent();

}
