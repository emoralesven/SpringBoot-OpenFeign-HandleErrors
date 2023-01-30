package com.bffspringboot.emoralesv.restclients;

import com.bffspringboot.emoralesv.aop.JsonProxyFeignClient;
import com.bffspringboot.emoralesv.dtos.User;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserClient.
 *
 * @author Eduardo Morales Venegas.
 * @version 1.0.0, 29-01-2023
 */
@JsonProxyFeignClient(
        name = "UserClient",
        url = "${ms.endpoints.servicios.user}")
public interface UserClient {

    @GetMapping(value="/users/{id}/",produces = "application/json")
    User getUser( @PathVariable(value = "id") Long id);

    @GetMapping(value="/users",produces = "application/json")
    List<User> getUsers();
}
