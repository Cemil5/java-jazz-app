package com.cydeo.dto;

import com.cydeo.entity.Role;
import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotBlank
    @Size(min = 2, max=15)
    @Pattern(regexp = "(?=.*[A-Z])") // First Name must starts with Uppercase character ([A-Z]\w*)
    private String firstName;

    @NotBlank
    @Size(min = 2, max=15)
    @Pattern(regexp = "(?=.*[A-Z])")
    private String lastName;

    @NotBlank
    @Email
    private String userName;

    @NotBlank
    @Pattern(regexp = "(?=.\\d)(?=.[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    @Pattern(regexp = "^\\d{10}$")
    private String phoneNumber;

    @NotBlank
    @Size(min = 10, max=15)
    private String address;

    //?
    private String confirmPassword;
    private Gender gender;
    private Role role;
    private String state;





}
