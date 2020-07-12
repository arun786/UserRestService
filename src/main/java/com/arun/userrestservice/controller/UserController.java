package com.arun.userrestservice.controller;

import com.arun.userrestservice.model.User;
import com.arun.userrestservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arun on 7/12/20
 */
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/v1/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User service = userService.getService(id);
        return ResponseEntity.ok(service);
    }
}
