package com.wangfan.springboot.mybatis.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Permission {

    private Long id;
    private String name;
    private String resource;
}
