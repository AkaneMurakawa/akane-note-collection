package com.example.mybatis;

import com.example.mybatis.dao.mapper.UserMapper;
import com.example.mybatis.model.User;
import com.example.mybatis.util.SHA256Util;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.security.SecureRandom;
import java.util.List;
import java.util.UUID;

/**
 * 测试tkMybatis的使用
 * get/list
 * update
 * delete
 * insert
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    /**
     * 测试插入数据，这里插入100个用户进行模拟测试
     */
    @Test
    public void insertTest(){
        User user = new User();
        String username;
        String password;
        String salt;
        SecureRandom secureRandom = new java.security.SecureRandom();
        for (int i = 1; i <= 100; i++){
            username = "user" + i;
            password = "password" + i;

            user.setUsercode(UUID.randomUUID().toString());
            user.setUsername(username);

            // 使用Java的SecureRandom生成随机数
            salt = String.valueOf(secureRandom.nextLong());
            user.setSalt(salt);

            // 使用编写好的SHA256工具类
            password = SHA256Util.encodeSHA256(username + salt + password);
            user.setPassword(password);

            user.setEmail(username + "@gmail.com");

            userMapper.insert(user);
            log.info("插入数据成功，msg: {}", user);
        }
    }

    /**
     * 测试分页查询数据
     */
    @Test
    public void ListTest(){
        int pageNum = 1;
        int pageSize = 10;
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        log.info("分页查询数据");
        for (User user : pageInfo.getList()){
            log.info("{}", user);
        }
    }

    /**
     * 测试随机数
     */
    @Test
    public void randomTest(){
        SecureRandom secureRandom = new java.security.SecureRandom();
        for (int n = 0; n < 10; n++){
            int value = secureRandom.nextInt();
            log.info("value: {}", value);
        }
    }
}
