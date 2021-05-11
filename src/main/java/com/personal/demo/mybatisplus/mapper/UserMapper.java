package com.personal.demo.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.personal.demo.mybatisplus.entity.User;
import com.personal.demo.mybatisplus.query.UserQuery;

public interface UserMapper extends BaseMapper<User> {
    IPage<UserQuery> getUserByIdWithTopicCount(IPage page, String userId);
    User getUserById(String id);
}
