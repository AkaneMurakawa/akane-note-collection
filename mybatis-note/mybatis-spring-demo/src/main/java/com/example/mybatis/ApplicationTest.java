package com.example.mybatis;

import com.example.mybatis.config.MybatisConfig;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applcationContext = new AnnotationConfigApplicationContext();
        applcationContext.register(MybatisConfig.class);
        // 刷新容器
        applcationContext.refresh();

        testMapper(applcationContext);
    }

    /**
     * 测Mapper是否注入
     * @param applcationContext
     */
    public static void testMapper(ApplicationContext applcationContext){
        UserMapper userMapper = (UserMapper)applcationContext.getBean("userMapper");
        User user = userMapper.selectOne(6001);
        User user1 = userMapper.selectOne(6001);
        System.out.println(user == user1);
    }
}
