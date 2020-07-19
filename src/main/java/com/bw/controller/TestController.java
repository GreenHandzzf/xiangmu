package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
   @RequestMapping("/test")
    public List test(){
       ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("hello");
        List<String> list=new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        modelAndView.addObject("list",list);
        return list;
    }
    @RequestMapping("/test1")
    public String test1(){
        System.out.println("mmm");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("hello");
        List<String> list=new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        modelAndView.addObject("list",list);
        return "www.html";
    }
    @RequestMapping("/rr")
    public String rr(){
        return "www.html";
    }
}
