package com.personal.demo.mybatisplus.service;

import com.personal.demo.mybatisplus.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, String> {
}
