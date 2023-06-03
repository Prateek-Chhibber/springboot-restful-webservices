package com.toxicprogrammer.springboot.repository;

import com.toxicprogrammer.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

//    UserRepository will support All CRUD operations.

}
