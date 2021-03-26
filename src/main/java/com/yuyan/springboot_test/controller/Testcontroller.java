package com.yuyan.springboot_test.controller;

import com.yuyan.springboot_test.pojo.Blog;
import com.yuyan.springboot_test.pojo.Student;
import com.yuyan.springboot_test.pojo.Teacher;
import com.yuyan.springboot_test.pojo.Teacher2;
import com.yuyan.springboot_test.service.BlogService;
import com.yuyan.springboot_test.service.StudentService;
import com.yuyan.springboot_test.service.TeacherService;
import com.yuyan.springboot_test.utils.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Testcontroller {

    @Autowired
    StudentService service;
    @Autowired
    TeacherService teacherService;
    @Autowired
    BlogService blogService;

    @GetMapping("/getstu")
    public List<Student> getstu() {
        return service.getStudentAll();
    }

    @GetMapping("/gettea")
    public Teacher2 gettea() {
        return teacherService.getTeacher(1);
    }

    @GetMapping("/addBlog")
    public int addBlog() {
        Blog blog = new Blog(IDUtil.genId(), "日本。。", "太郎", new Date(), 2);
        Blog blog2 = new Blog(IDUtil.genId(), "台湾地震", "新华日报", new Date(), 3);
        Blog blog3 = new Blog(IDUtil.genId(), "山东GDP", "山东卫视", new Date(), 1);
        Blog blog4 = new Blog(IDUtil.genId(), "北京车流量。", "新华日报", new Date(), 2);
        blogService.addBlog(blog);
        blogService.addBlog(blog2);
        blogService.addBlog(blog3);
        blogService.addBlog(blog4);
        return 1;
    }

    @GetMapping("/findBlog")
    public List<Blog> findBlog() {
        Map m = new HashMap();
//        m.put("title", "台湾地震");
        m.put("title", null);
        m.put("author", "新华日报");
        return blogService.findBlog(m);
    }

    @GetMapping("/update")
    public Integer update() {
        Map map = new HashMap();
        map.put("id", "2cd5f3fa1897424d9ccde74a567215b2");
        map.put("title", "坎坎坷坷");
        map.put("author", "哎哎哎啊a7");
        return blogService.updateBlogByid(map);
    }
}
