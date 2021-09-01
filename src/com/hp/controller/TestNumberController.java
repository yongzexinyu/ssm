package com.hp.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestNumberController implements Controller {

    // controller 中有个方法叫做  模型和视图 意思是把视图和模型绑定到一起？
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("我是模型和视图");
        System.out.println("注意要写的和前端的视图名称一样");
        ModelAndView modelAndView=new ModelAndView("test02");
        return modelAndView;
    }
}
