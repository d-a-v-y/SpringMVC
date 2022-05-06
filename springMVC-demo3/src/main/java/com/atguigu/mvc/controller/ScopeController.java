package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Davy
 */

@Controller
public class ScopeController {

    //使用ServletAPI向servlet域共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","Hello!ServletAPI!");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new ModelAndView();
        //处理模型数据，即向请求域request共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
        //设置视图名称
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","Hello!model!");
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","Hello!Map!");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","Hello!ModelMap!");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","Hello!Session!");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope","Hello!Application(ServletContext)");
        return "success";
    }
}
