package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class User {

     private  String firstname;
     private  String lastname;
     private  String email;
     private  String password;
     private  String confirmPassword;
     private Gender gender;
     private  String address;
     private  String state;
     private  String phoneNumber;

     public User(String firstname, String lastname, String email, String password,
                 String confirmPassword, Gender gender, String address, String state, String phoneNumber) {
          this.firstname = firstname;
          this.lastname = lastname;
          this.email = email;
          this.password = password;
          this.confirmPassword = confirmPassword;
          this.gender = gender;
          this.address = address;
          this.state = state;
          this.phoneNumber = phoneNumber;
     }
}
