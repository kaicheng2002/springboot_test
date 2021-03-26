package com.yuyan.springboot_test.service;

import com.yuyan.springboot_test.dao.StudentMapper;
import com.yuyan.springboot_test.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentAll();
}
