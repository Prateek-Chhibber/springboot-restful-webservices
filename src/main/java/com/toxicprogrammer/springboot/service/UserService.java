package com.toxicprogrammer.springboot.service;

import com.toxicprogrammer.springboot.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();
}
