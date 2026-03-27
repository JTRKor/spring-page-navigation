package com.example.pagenavigation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/second")
    public String second() {
        return "second";
    }

    @GetMapping("/third-loading")
    public String thirdLoading() {
        return "third-loading";
    }

    @GetMapping("/api/sleep")
    @ResponseBody
    public ResponseEntity<String> sleep() throws InterruptedException {
        Thread.sleep(5000);
        return ResponseEntity.ok("done");
    }

    @GetMapping("/third")
    public String third() {
        return "third";
    }
}
