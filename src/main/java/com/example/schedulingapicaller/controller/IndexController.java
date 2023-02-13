package com.example.schedulingapicaller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 新类
 *
 * @author youbl
 * @date 2023/2/13 17:53
 */
@RestController
public class IndexController {
    @GetMapping("")
    public String index() {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        return now + " " + this.getClass().getName();
    }
}
