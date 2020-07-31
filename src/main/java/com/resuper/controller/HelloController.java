package com.resuper.controller;

import com.resuper.pojo.User;
import io.swagger.annotations.ApiKeyAuthDefinition;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello World";
//    }

    @GetMapping("/hello1")
    public String hello1(){
        return "Hello World";
    }

    @PostMapping("/hello2")
    public String hello2(){
        return "Hello World";
    }

    @DeleteMapping("/hello3")
    public String hello3(){
        return "Hello World";
    }
    @PutMapping("/hello4")
    public String hello4(){
        return "Hello World";
    }

    @PutMapping("/user")
    public User hello5(){
        return new User();
    }


    @GetMapping("/hellousername")
    @ApiOperation("控制器类的注释")
    public String hello77(String userNmae){
        return "hello" + userNmae;
    }

    @PostMapping("/hellousername2")
    public String hello8(String userNmae){
        return "hello" + userNmae;
    }







}
