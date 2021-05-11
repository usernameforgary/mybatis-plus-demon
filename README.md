# Mybatis plus demo project

### Reference Document of mybatis plus

* [Mybatis guide]https://baomidou.com/guide/

### TODO

* spring boot initial database with scripts
* UserController getUserWithCountOfTopicMapper return user with id null 

### Notices

* how to config mysql statement console with mybatis plus
* how to config mybatis plus support pagination
* mybatis-plus mapper embed association
    ```html
      <resultMap id="singleTopQueryResult" type="com.personal.demo.mybatisplus.query.TopicQuery">
          <association property="publisher" column="publisher" select="com.personal.demo.mybatisplus.mapper.UserMapper.getUserById"/>
      </resultMap>
      <select id="getTopicById" resultMap="singleTopQueryResult">
          select * from topic where id = #{topicId}
      </select>
    ```
    property对应需要映射的类里，对应的字段
    column是当前查询中，需要传递到后面select指定查询的字段
   
    
        

    
