package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String printWelcome() {
        return "welcome测1试";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/health/check", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String healthcheck() {
        return "healthcheck:ok";
    }

    @RequestMapping(value = "/checkpreload.htm", method = RequestMethod.GET)
    @ResponseBody
    public String printSuccess() {
        return "succes1";
    }


}
