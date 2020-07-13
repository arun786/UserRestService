package com.arun.userrestservice.service;

import com.arun.userrestservice.dao.UserDao;
import com.arun.userrestservice.mapper.UserMapper;
import com.arun.userrestservice.model.User;
import com.arun.userrestservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author arun on 7/12/20
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(Long id) {
        Optional<UserDao> userDao = userRepository.findById(id);
        //todo throw an exception instead of null
        return userDao.map(userMapper::userDaoToUser).orElse(null);
    }

    @Override
    public User addUser(User user) {
        UserDao userDao = userMapper.userToUserDao(user);
        UserDao userReturned = userRepository.save(userDao);
        return userMapper.userDaoToUser(userReturned);
    }
}
