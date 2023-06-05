package com.toxicprogrammer.springboot.repository;

import com.toxicprogrammer.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

//    UserRepository will support All CRUD operations.
    Optional<User> findByEmail(String email);

}
