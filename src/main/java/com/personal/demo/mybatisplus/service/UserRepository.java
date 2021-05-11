package com.personal.demo.mybatisplus.service;

import com.personal.demo.mybatisplus.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
