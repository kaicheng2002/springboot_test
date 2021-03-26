package com.yuyan.springboot_test.service.impl;

import com.yuyan.springboot_test.dao.TeacherMapper;
import com.yuyan.springboot_test.pojo.Teacher;
import com.yuyan.springboot_test.pojo.Teacher2;
import com.yuyan.springboot_test.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper mapper;

    @Override
    public Teacher2 getTeacher(int i) {
        return mapper.getteacherbyid(i);
    }
}
