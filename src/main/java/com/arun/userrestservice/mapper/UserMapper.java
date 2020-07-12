package com.arun.userrestservice.mapper;

import com.arun.userrestservice.dao.UserDao;
import com.arun.userrestservice.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User userDaoToUser(UserDao userDao);

    UserDao userToUserDao(User user);
}
