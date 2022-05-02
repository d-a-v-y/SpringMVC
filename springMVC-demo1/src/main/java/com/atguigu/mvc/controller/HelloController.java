package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Davy
 */

@Controller
public class HelloController {

    //web.xml文件中的'/' --> /WEB-INF/templates/index.html
    @RequestMapping(value = "/")//联系web.xml和springMVC.xml中配置的视图前缀和视图后缀
    public String index(){
        //返回视图名称，视图名称决定跳转到的页面
        return "index";
    }
}
