package com.wisdom.tutorial.service;

import java.util.List;

import com.wisdom.tutorial.model.User;
import com.wisdom.tutorial.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
