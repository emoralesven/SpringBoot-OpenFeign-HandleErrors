package com.bffspringboot.emoralesv.services;

import com.bffspringboot.emoralesv.dtos.User;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface UserService {

    List<User> getUsers(HttpHeaders headers);
    User getUser(Long id);
}
