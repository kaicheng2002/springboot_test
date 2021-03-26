package com.yuyan.springboot_test.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student02 {
    private Integer id;
    private String name;
    private Integer tid;
}
