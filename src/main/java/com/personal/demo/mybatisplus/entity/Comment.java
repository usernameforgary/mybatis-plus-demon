package com.personal.demo.mybatisplus.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Comment {
    @Id
    private String id;
    @Column(columnDefinition = "varchar(200) COMMENT '评论内容'")
    private String content;
    @Column(columnDefinition = "int(10) COMMENT '所属话题'")
    private int topicId;
    @Column(columnDefinition = "int(10) COMMENT '评论发布者'")
    private int userId;
}
