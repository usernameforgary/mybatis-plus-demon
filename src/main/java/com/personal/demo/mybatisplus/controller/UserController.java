package com.personal.demo.mybatisplus.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.personal.demo.mybatisplus.entity.User;
import com.personal.demo.mybatisplus.mapper.UserMapper;
import com.personal.demo.mybatisplus.query.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
   @Resource
   @Autowired
   private UserMapper userMapper;

   @GetMapping("/")
   public List<User> getAllUser() {
       return userMapper.selectList(null);
   }

   @GetMapping("/userMapper")
   public IPage<UserQuery> getAllUserMapper(@RequestParam(defaultValue="1") int currentPage, @RequestParam(defaultValue = "2") int pageSize) {
      Page page = new Page(currentPage,pageSize);
      return userMapper.getAllUser(page);
   }
}
