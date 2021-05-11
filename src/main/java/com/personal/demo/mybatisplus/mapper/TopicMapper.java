package com.personal.demo.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.personal.demo.mybatisplus.entity.Topic;
import com.personal.demo.mybatisplus.query.TopicQuery;

public interface TopicMapper extends BaseMapper<Topic> {
    TopicQuery getTopicById(String topicId);
}
