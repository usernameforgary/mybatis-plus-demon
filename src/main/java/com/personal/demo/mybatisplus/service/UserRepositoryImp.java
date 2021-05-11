package com.personal.demo.mybatisplus.service;

import com.personal.demo.mybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImp {
    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
