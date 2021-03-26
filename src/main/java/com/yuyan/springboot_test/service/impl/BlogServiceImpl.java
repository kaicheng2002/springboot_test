package com.yuyan.springboot_test.service.impl;

import com.yuyan.springboot_test.dao.BlogMapper;
import com.yuyan.springboot_test.pojo.Blog;
import com.yuyan.springboot_test.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.addBlog(blog);
    }

    @Override
    public List<Blog> findBlog(Map map) {
        return blogMapper.findBlog(map);
    }

    @Override
    public Integer updateBlogByid(Map map) {
        return blogMapper.findBlogbyId(map);
    }
}
