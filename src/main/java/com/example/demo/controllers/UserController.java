package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/users")
@Controller
public class UserController {
    public UserController() {

    }

    @RequestMapping({"", "/index",  "/index.html"})
    public @ResponseBody String index() {
        return "index";
    }
}
