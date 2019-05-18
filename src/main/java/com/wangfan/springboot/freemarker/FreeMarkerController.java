package com.wangfan.springboot.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeMarkerController {
    @RequestMapping("/hello")
    public String helloPage(Model model){
        model.addAttribute("name","jack");
        return "hello";
    }
}
