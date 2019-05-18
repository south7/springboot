package com.wangfan.springboot.mybatis.mapper;

import com.wangfan.springboot.mybatis.domain.Permission;

import java.util.List;

public interface PermissionMapper {

    public List<Permission> findAll()throws Exception;
}
