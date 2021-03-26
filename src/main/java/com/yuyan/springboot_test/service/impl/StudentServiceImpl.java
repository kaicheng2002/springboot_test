package com.yuyan.springboot_test.service.impl;

import com.yuyan.springboot_test.dao.StudentMapper;
import com.yuyan.springboot_test.pojo.Student;
import com.yuyan.springboot_test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getStudentAll() {
        return studentMapper.getStudent();
    }
}
