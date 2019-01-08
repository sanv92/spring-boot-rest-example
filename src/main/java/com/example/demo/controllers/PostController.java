package com.example.demo.controllers;

import com.example.demo.model.Post;
import com.example.demo.services.PostApiService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(description = "This is my Posts controller")
@RequestMapping("/api/posts")
@Controller
public class PostController {
    private final PostApiService postApiService;

    public PostController(@Autowired PostApiService postApiService) {
        this.postApiService = postApiService;
    }

    @RequestMapping({"", "/index",  "/index.html"})
    public @ResponseBody String index() {
        return "index";
    }

    @GetMapping("/{postId}")
    public @ResponseBody Post getPost(@PathVariable("postId") Long postId) {
        return postApiService.getPost(postId);
    }
}
