package com.example.demo;

import com.example.demo.dao.RedisDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private RedisDao redisDao;

    @Test
    void test() {
        redisDao.set("k1", "v1");
    }

}
