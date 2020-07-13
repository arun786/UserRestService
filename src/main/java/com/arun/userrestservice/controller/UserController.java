package com.arun.userrestservice.controller;

import com.arun.userrestservice.model.User;
import com.arun.userrestservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        User service = userService.getUserById(id);
        return ResponseEntity.ok(service);
    }

    @PostMapping("/v1/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User userReturned = userService.addUser(user);
        return new ResponseEntity<>(userReturned, HttpStatus.CREATED);
    }
}
