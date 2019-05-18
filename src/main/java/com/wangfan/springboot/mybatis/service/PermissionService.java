package com.wangfan.springboot.mybatis.service;

import com.wangfan.springboot.mybatis.domain.Permission;

import java.util.List;

public interface PermissionService {

    public List<Permission> findAll()throws Exception;

}
