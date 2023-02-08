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
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private  final UserClient userClient;
    private  List<User> userList;
    @Override
    public List<User> getUsers(HttpHeaders headers) {

        userList = userClient.getUsers();
        return  userList.stream()
                .filter(user -> user
                        .getCompany()
                        .getName()
                        .startsWith("Romaguera"))
                .collect(Collectors.toList());

    }

    @Override
    public User getUser( Long id) {
        return userClient.getUser(id);
    }
}
