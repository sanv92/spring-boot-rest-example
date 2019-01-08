package com.example.demo.services;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class PostApiServiceImpl implements PostApiService {
    private RestTemplate restTemplate;

    private final String api_url;

    public PostApiServiceImpl(@Autowired RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    public Post getPost(Long postId) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/posts/{postId}");

        return restTemplate.getForObject(uriBuilder.toUriString(), Post.class, postId.toString());
    }
}
