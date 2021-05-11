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
      <!--
          **property**属性：对应type里需要映射的属性名
          **column**属性：对应需要传入association的**select**属性对应的查询中的字段名（表的列名）
      -->
      <select id="getTopicById" resultMap="singleTopQueryResult">
          select * from topic where id = #{topicId}
      </select>
    ```
    
   
    
        

    
