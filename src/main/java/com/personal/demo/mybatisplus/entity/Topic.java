package com.personal.demo.mybatisplus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    @Id
    private String id;
    @Column(columnDefinition="varchar(255) COMMENT '话题主题'")
    private String subject;
    @Column(columnDefinition="varchar(255) COMMENT '话题发布者'")
    private String publisher;
}