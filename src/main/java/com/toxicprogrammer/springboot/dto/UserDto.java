package com.toxicprogrammer.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "UserDto Model Integration"
)
public class UserDto {

    @Schema(
            description = "User id auto generated"
    )
    private Long id;

//    User firstName should not be null or empty
    @Schema(
            description = "User First Name"
    )
    @NotEmpty(message = "User first name should not be null or empty")
    private String firstName;

//    User lastName should not be null or empty
@Schema(
        description = "User Last Name"
)
    @NotEmpty(message = "User last name should not be null or empty")
    private String lastName;

//    User email should not be null or empty
//    Email Address should be valid
@Schema(
        description = "User Email Address"
)
    @NotEmpty(message = "User email should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
