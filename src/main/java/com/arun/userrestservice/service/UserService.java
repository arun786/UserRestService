package com.arun.userrestservice.service;

import com.arun.userrestservice.model.User;

/**
 * @author arun on 7/12/20
 */
public interface UserService {
    User getUserById(Long id);

    User addUser(User user);
}
