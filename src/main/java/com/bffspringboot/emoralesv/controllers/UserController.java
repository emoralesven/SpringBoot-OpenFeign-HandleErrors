package com.bffspringboot.emoralesv.controllers;

import com.bffspringboot.emoralesv.dtos.User;
import com.bffspringboot.emoralesv.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * UserController.
 *
 * @author Eduardo Morales Venegas.
 * @version 1.0.0, 29-01-2023
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;


    @GetMapping("")
    public List<User> getUsers(@RequestHeader HttpHeaders headers){

        return userService.getUsers(headers);
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){

        return userService.getUser(id);
    }
}
