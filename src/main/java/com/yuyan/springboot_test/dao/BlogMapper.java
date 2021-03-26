package com.yuyan.springboot_test.dao;

import com.yuyan.springboot_test.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BlogMapper {
    int addBlog(Blog b);

    List<Blog> findBlog(Map map);

    Integer findBlogbyId(Map map);
}
