package com.alioss.controller;

import com.alioss.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: zyw
 * @Date: 2017/12/13
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public String index(){
        System.out.println("Helloworld");
        return "index";
    }

    @ResponseBody
    @GetMapping("/hello")
    public Person hello(){
        Person person = new Person();
        person.setId("1");
        person.setName("你好");
        person.setSex("1");
        return person;
    }
}
