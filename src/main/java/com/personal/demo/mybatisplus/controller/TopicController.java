package com.personal.demo.mybatisplus.controller;

import com.personal.demo.mybatisplus.entity.Topic;
import com.personal.demo.mybatisplus.query.TopicQuery;
import com.personal.demo.mybatisplus.service.TopicRepository;
import com.personal.demo.mybatisplus.service.TopicRepositoryImp;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/topic")
public class TopicController {
    private final TopicRepositoryImp topicRepositoryImp;

    @Autowired
    public TopicController(TopicRepositoryImp topicRepositoryImp) {
        this.topicRepositoryImp = topicRepositoryImp;
    }

    @Data
    static class DTO_NewTopic {
        String subject;
        String publisher;
    }

    @PostMapping("/create")
    public Topic createTopic(@RequestBody DTO_NewTopic newTopic) {
        return topicRepositoryImp.createTopic(newTopic.subject, newTopic.publisher);
    }

    @GetMapping("/get")
    public TopicQuery getTopicById(@RequestParam String id) {
        return topicRepositoryImp.getTopicById(id);
    }

}
