package com.personal.demo.mybatisplus.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Teacher {
    @Id
    private UUID id;
    private String name;
}
