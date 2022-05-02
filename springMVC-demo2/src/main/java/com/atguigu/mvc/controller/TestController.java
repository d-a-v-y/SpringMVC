package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Davy
 */

@Controller//表示作为控制层组件
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
