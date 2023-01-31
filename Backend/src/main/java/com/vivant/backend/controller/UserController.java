package com.vivant.backend.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vivant.backend.entity.User;
import com.vivant.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController
{
    @Autowired
    private UserService  userService;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user)
    {
        System.out.println("HI");
        return ResponseEntity.ok("user registered");
    }

}
