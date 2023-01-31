package com.bffspringboot.emoralesv.services;

import com.bffspringboot.emoralesv.dtos.Post;
import com.bffspringboot.emoralesv.dtos.User;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface PostService {

    List<Post> getPosts(HttpHeaders headers);
    Post getPost(Long id);
}
