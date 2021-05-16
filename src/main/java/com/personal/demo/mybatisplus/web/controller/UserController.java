package com.personal.demo.mybatisplus.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.personal.demo.mybatisplus.entity.User;
import com.personal.demo.mybatisplus.exception.UserNotExistsException;
import com.personal.demo.mybatisplus.mapper.UserMapper;
import com.personal.demo.mybatisplus.query.UserQuery;
import com.personal.demo.mybatisplus.service.UserRepositoryImp;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {
   @Resource
   @Autowired
   private UserMapper userMapper;
   private final UserRepositoryImp userRepositoryImp;

   @Autowired
   public UserController(UserRepositoryImp userRepositoryImp) {
      this.userRepositoryImp = userRepositoryImp;
   }

   @GetMapping("/create")
   @ResponseBody
   public User createUser(@RequestParam String name) {
      String userId = UUID.randomUUID().toString();
      User user = new User(userId, name);

      return userRepositoryImp.createUser(user);
   }


   @GetMapping("/getUserById/{id}")
   public UserQuery getUserById(@PathVariable String id) {
      System.out.println(id);
      UserQuery userQuery = new UserQuery();
      return userQuery;
   }

   @GetMapping("/all")
   public List<User> getAllUser() {
       return userMapper.selectList(null);
   }


   @GetMapping("/getUserWithCountOfTopicMapper")
   @Operation(description = "查询指定用户及用户发起的讨论数量-mapper方式")
   public IPage<UserQuery> getAllUserMapper(@RequestParam String userId, @RequestParam(defaultValue="1") int currentPage, @RequestParam(defaultValue = "2") int pageSize) {
      Page page = new Page(currentPage,pageSize);
      return userMapper.getUserByIdWithTopicCount(page, userId);
   }

   @GetMapping("/getUserNotFoundEx")
   public UserQuery throwUserNotFoundException() {
      throw new UserNotExistsException("user id");
   }

   @GetMapping("/useTimeFilter")
   public void useTimeFilter() {

   }
}
