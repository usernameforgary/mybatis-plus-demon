package com.personal.demo.mybatisplus.service;

import com.personal.demo.mybatisplus.entity.Topic;
import com.personal.demo.mybatisplus.mapper.TopicMapper;
import com.personal.demo.mybatisplus.query.TopicQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TopicRepositoryImp {
   private final TopicRepository topicRepository;
   private final TopicMapper topicMapper;

   @Autowired
   public TopicRepositoryImp(TopicRepository topicRepository, TopicMapper topicMapper) {
      this.topicRepository = topicRepository;
      this.topicMapper = topicMapper;
   }

   public Topic createTopic(String topicSubject, String publisher) {
       String topicId = UUID.randomUUID().toString();
       Topic topic = new Topic(topicId, topicSubject, publisher);
       return topicRepository.save(topic);
   }

   public TopicQuery getTopicById(String topicId) {
       return topicMapper.getTopicById(topicId);
   }
}
