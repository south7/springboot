package com.wangfan.springboot.mybatis.service.impl;

import com.wangfan.springboot.mybatis.domain.Permission;
import com.wangfan.springboot.mybatis.mapper.PermissionMapper;
import com.wangfan.springboot.mybatis.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional//表示该类下面所有的方法都需要事物
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<Permission> findAll() throws Exception {
        return permissionMapper.findAll();
    }
}
