package com.ahmed.web.controllers;

import com.ahmed.web.model.User;
import com.ahmed.web.services.CategoryService;
import com.ahmed.web.services.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/get/user")
    public List<User> getAllUserController() {
        return userService.getAllUser();
    }


    @PostMapping("/api/insert/user")
    public void insertUserController(User user) {
        userService.insertUser(user);


    }

    @PostMapping("/api/update/user")
    public void updateUser(User user) {

        userService.updateUser(user);

    }

    @DeleteMapping("/api/delete/user")
    public void deleteUser(User user) {
        userService.deleteUser(user);
    }

}
