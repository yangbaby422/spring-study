package com.spring.orm.service;

import com.spring.orm.entity.User;

import java.util.List;

public interface UserService {

    int insertUser(User user);

    int deleteUser(long id);

    int updateUser(User user);

    List<User> selectUsers();

    User getUser(long id);
}