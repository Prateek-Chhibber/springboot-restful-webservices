package com.toxicprogrammer.springboot.service;

import com.toxicprogrammer.springboot.dto.UserDto;
import com.toxicprogrammer.springboot.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
