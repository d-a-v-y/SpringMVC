package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author Davy
 * <p>
 * 获取请求参数功能演示
 */

@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ", password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false, defaultValue = "hello") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "hello", required = true, defaultValue = "world") String host) {
        //若请求参数中出现多个重名的请求参数,可以在控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
        //若使用字符串类型的形参，最终结果为请求请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:" + username + ", password:" + password + ",hobby:" + Arrays.toString(hobby));
        System.out.println("host:" + host);
        return "success";
    }
}
