package com.alioss.controller;

import com.alioss.common.base.BaseController;
import com.alioss.common.result.Result;
import com.alioss.common.result.Results;
import com.alioss.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: zyw
 * @Date: 2017/12/13
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@RequestMapping("/home")
public class HomeController extends BaseController{

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

    @ResponseBody
    @PostMapping("/login")
    public Result<String> login(){
        return Results.success("登录成功");
    }

    @ResponseBody
    @PostMapping("/regist")
    public Result<String> regist(){
        return Results.success("注册成功");
    }
}
