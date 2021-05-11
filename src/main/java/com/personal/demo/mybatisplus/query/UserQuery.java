package com.personal.demo.mybatisplus.query;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.personal.demo.mybatisplus.entity.Topic;
import lombok.Data;

import java.util.UUID;

@Data
public class UserQuery {
    private String id;
    private String name;
    private int topicCount;
}
