package com.bffspringboot.emoralesv.controllers;


import com.bffspringboot.emoralesv.dtos.Post;
import com.bffspringboot.emoralesv.dtos.User;
import com.bffspringboot.emoralesv.services.PostService;
import com.bffspringboot.emoralesv.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "posts", produces = MediaType.APPLICATION_JSON_VALUE)
public class PostController {

    private final PostService postService;


    @GetMapping("")
    public List<Post> getPosts(@RequestHeader HttpHeaders headers){

        return postService.getPosts(headers);
    }
    @GetMapping("/{id}")
    public Post getPost(@PathVariable("id") Long id){

        return postService.getPost(id);
    }

}

