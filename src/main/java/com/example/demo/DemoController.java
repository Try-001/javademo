package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Zhangxixi
 * @Date 2019-11-26
 */

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,liweihua,xxx";
    }

}
