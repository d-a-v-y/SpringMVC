package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Davy
 */

@Controller
public class JspController {

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
