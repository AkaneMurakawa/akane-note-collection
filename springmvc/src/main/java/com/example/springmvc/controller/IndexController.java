package com.example.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    /**
     * 测试视图映射
     * @return
     */
    @RequestMapping("/modelViewTest")
    public String modelViewTest(){
        return "index";
    }

    /**
     * 测试json
     * @return
     */
    @RequestMapping("/jsonTest")
    @ResponseBody
    public String jsonTest(){
        return "index";
    }
}
