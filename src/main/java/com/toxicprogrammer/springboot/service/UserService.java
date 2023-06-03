package com.toxicprogrammer.springboot.service;

import com.toxicprogrammer.springboot.entity.User;

public interface UserService {

    User createUser(User user);

    User getUserById(Long userId);
}
