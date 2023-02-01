package com.bffspringboot.emoralesv.restclients;

import com.bffspringboot.emoralesv.aop.JsonProxyFeignClient;
import com.bffspringboot.emoralesv.dtos.Post;
import com.bffspringboot.emoralesv.dtos.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@JsonProxyFeignClient(
        name = "PostClient",
        url = "${ms.endpoints.servicios}")
public interface PostClient {

    @GetMapping(value="/posts/{id}/",produces = "application/json")
    Post getPost(@PathVariable(value = "id") Long id);

    @GetMapping(value="/posts",produces = "application/json")
    List<Post> getPosts();
}
