package com.cydeo.controller;


import com.cydeo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public String userController(Model model) {

     model.addAttribute("user", new UserDTO());

        return "user/user-create";
    }



}
