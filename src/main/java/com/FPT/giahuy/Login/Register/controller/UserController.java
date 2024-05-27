package com.FPT.giahuy.Login.Register.controller;

import com.FPT.giahuy.Login.Register.dto.MemberDTO;
import com.FPT.giahuy.Login.Register.dto.UserDTO;
import com.FPT.giahuy.Login.Register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        UserDTO user = userService.createUser(userDTO);
        return user;
    }

    @PostMapping("/login")
    public boolean login(@RequestBody MemberDTO memberDTO) {
        boolean user = userService.login(memberDTO);
        if (user == true) {
            return true;
        }
        return false;

    }
}
