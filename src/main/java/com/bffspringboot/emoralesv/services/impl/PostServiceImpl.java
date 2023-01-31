package com.bffspringboot.emoralesv.services.impl;

import com.bffspringboot.emoralesv.dtos.Post;
import com.bffspringboot.emoralesv.dtos.User;
import com.bffspringboot.emoralesv.restclients.PostClient;
import com.bffspringboot.emoralesv.services.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostClient postClient;
    @Override
    public List<Post> getPosts(HttpHeaders headers) {
        return postClient.getPosts();
    }

    @Override
    public Post getPost(Long id) {
        return postClient.getPost(id);
    }
}
