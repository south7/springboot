package com.wangfan.springboot.mybatis.controller;

import com.wangfan.springboot.mybatis.domain.Permission;
import com.wangfan.springboot.mybatis.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Permission> findAll(){
        try {
            return permissionService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
