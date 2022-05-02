package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Davy
 */

@Controller
public class HelloController {

    //@RequestMapping是请求映射
    //web.xml文件中的'/' --> /WEB-INF/templates/index.html
    @RequestMapping(value = "/")//联系web.xml和springMVC.xml中配置的视图前缀和视图后缀
    public String index(){
        //返回视图名称，视图名称决定跳转到的页面
        return "index";
    }

    //前端页面未出现......./target.html,没有html所有属于转发
    @RequestMapping(value = "/target")//此处的"/target"对应index里的@{"/target"}
    public String toTarget(){
        return "target";
    }

    /*
    总结：
    浏览器发送请求，若请求地址符合前端控制器的url-pattern，
    该请求就会被前端控制器DispatcherServlet处理。前端控制器会读取SpringMVC的核心配置文件，
    通过扫描组件找到控制器，将请求地址和控制器中@RequestMapping注解的value属性值进行匹配，
    若匹配成功，该注解所标识的控制器方法就是处理请求的方法。
    处理请求的方法需要返回一个字符串类型的视图名称，该视图名称会被视图解析器解析，
    加上前缀和后缀组成视图的路径，通过Thymeleaf对视图进行渲染，最终转发到视图所对应页面
     */
}
