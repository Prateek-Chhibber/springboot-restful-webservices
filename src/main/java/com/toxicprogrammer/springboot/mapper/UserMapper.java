package com.toxicprogrammer.springboot.mapper;

import com.toxicprogrammer.springboot.dto.UserDto;
import com.toxicprogrammer.springboot.entity.User;

public class UserMapper {

//  Convert UserDto into JPA Entity
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

//    Convert User JPA entity into userDto
    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
