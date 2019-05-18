package com.wangfan.springboot.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.SQLException;

@Controller
public class DataSourceController {
    @Autowired
    private DataSource dataSource;
    @RequestMapping("/druidDataSource")
    @ResponseBody
    public String dataSourcePage() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource);
        return "Hello DataSource";
    }
}
