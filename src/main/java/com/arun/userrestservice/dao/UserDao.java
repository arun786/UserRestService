package com.arun.userrestservice.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDao {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
