package com.huangguang.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2018-01-18 10:53
 */
@RestController
public class HelloAController {
    @RequestMapping(value = "hello")
    public String hello() {
        return "hello A";
    }
}
