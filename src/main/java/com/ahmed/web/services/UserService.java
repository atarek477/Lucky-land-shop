package com.ahmed.web.services;


import com.ahmed.web.model.User;
import com.ahmed.web.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public void insertUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {

        userRepository.save(user);

    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
