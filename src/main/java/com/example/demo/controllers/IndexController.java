package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/api")
@Controller
public class IndexController {
    public IndexController() {

    }

    @RequestMapping({"", "/index",  "/index.html"})
    public @ResponseBody String index() {
        return "index";
    }
}
