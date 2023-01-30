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
    public List<User> consultaSaldosPorNumeroCuenta(@RequestHeader HttpHeaders headers){

        return userService.getUsers(headers);
    }
    @GetMapping("/user2")
    public String consultaSaldosPorNumeroCuenta2( @RequestHeader HttpHeaders headers){
        String uri = "https://jsonplaceholder.typicode.com/users/1";
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);
        System.out.println("User: " + user);

        System.out.println("Userid: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        return "User detail page.";
    }
    @GetMapping("/user/{id}")
    public User consultaSaldosPorNumeroCuenta3(@PathVariable("id") Long id){

        return userService.getUser(id);
    }
}
