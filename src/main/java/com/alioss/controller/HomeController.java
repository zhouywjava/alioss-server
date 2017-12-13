package com.alioss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: zyw
 * @Date: 2017/12/13
 */
@Controller
@RequestMapping("/alioss")
public class HomeController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
