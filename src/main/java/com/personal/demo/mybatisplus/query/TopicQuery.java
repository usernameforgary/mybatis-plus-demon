package com.personal.demo.mybatisplus.query;

import com.personal.demo.mybatisplus.entity.User;
import lombok.Data;

@Data
public class TopicQuery {
    private String id;
    private String subject;
    private User publisher;
}
