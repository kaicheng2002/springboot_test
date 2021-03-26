package com.yuyan.springboot_test.service;

import com.yuyan.springboot_test.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogService {
    int addBlog(Blog blog);

    List<Blog> findBlog(Map map);

    Integer updateBlogByid(Map map);
}
