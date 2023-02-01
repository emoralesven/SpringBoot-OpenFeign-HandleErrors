package com.bffspringboot.emoralesv.services.impl;

import com.bffspringboot.emoralesv.dtos.User;
import com.bffspringboot.emoralesv.restclients.UserClient;
import com.bffspringboot.emoralesv.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private  final UserClient userClient;

    @Override
    public List<User> getUsers(HttpHeaders headers) {
        return userClient.getUsers();    }

    @Override
    public User getUser( Long id) {
        return userClient.getUser(id);
    }
}
