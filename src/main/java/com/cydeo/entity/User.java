package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get set method
@NoArgsConstructor // empty const
//@AllArgsConstructor // normal param cost.
public class User {

    public User(String firstName, String lastName, String email, String password, String confirmPassword, Gender gender, String address, String state, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.gender = gender;
        this.address = address;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
    private Gender gender;
    private String address;
    private String state;
    private String phoneNumber;



}
