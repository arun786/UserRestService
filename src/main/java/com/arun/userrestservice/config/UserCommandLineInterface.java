package com.arun.userrestservice.config;

import com.arun.userrestservice.dao.UserDao;
import com.arun.userrestservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author arun on 7/12/20
 */
@Component
public class UserCommandLineInterface implements CommandLineRunner {
    private UserRepository userRepository;

    @Autowired
    public UserCommandLineInterface(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        UserDao userDao = UserDao.builder()
                .email("aruntcs20052gmail.com")
                .firstName("arun")
                .lastName("singh")
                .phone("4802321632").build();

        userRepository.save(userDao);

        userDao = UserDao.builder()
                .email("abc@gmail.com")
                .firstName("abc")
                .lastName("singh")
                .phone("456789123").build();

        userRepository.save(userDao);
    }
}
