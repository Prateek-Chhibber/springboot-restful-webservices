package com.toxicprogrammer.springboot.controller;

import com.toxicprogrammer.springboot.dto.UserDto;
import com.toxicprogrammer.springboot.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
@Tag(
        name = "CRUD REST APIs for User Resource",
        description = "CRUD REST APIs - Create user, get user, get all users, update user and delete user"
)
public class UserController {

    private UserService userService;

//    Build create User API
    @Operation(
            summary = "Create User REST API",
            description = "Save user to database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 created"

    )
    @PostMapping()
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto user){
       UserDto savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

//    build get user by id REST API
//    http://localhost:8080/api/users/1
@Operation(
        summary = "Get User REST API",
        description = "Get user from database"
)
@ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 retrieved"

)
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
        UserDto user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

//    Build GET all users REST API
//    http://localhost:8080/api/users
@Operation(
        summary = "Get All Users REST API",
        description = "Get All Users from database"
)
@ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 SUCCESS"

)
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

//    Build Update User REST API
    @PutMapping("{id}")
    @Operation(
            summary = "Update User REST API",
            description = "Update user and save to database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"

    )
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId, @Valid @RequestBody UserDto user){
        user.setId(userId);
        UserDto  updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }

//    Build Delete User REST API
@Operation(
        summary = "Delete User REST API",
        description = "Delete user from database"
)
@ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 SUCCESS"

)
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User Successfully Deleted",HttpStatus.OK);
    }

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
//                                                                        WebRequest webRequest){
//        ErrorDetails errorDetails = new ErrorDetails(
//                LocalDateTime.now(),
//                exception.getMessage(),
//                webRequest.getDescription(false),
//                "USER_NOT_FOUND"
//        );
//
//        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
//    }

}
