package com.example.demo;

import com.example.demo.dao.RedisDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private RedisDao redisDao;

    /**
     * 测试写
     * @return
     */
    @RequestMapping("/w")
    public String writeTest() {
        redisDao.set("k1", "v1");
        return "write";
    }

    /**
     * 测试写
     * @return
     */
    @RequestMapping("/r")
    public String readTest() {
        Object k1 = redisDao.get("k1");
        return "read: " + k1;
    }

    /**
     * 测试删
     * @return
     */
    @RequestMapping("/d")
    public String deleteTest() {
        redisDao.del("k1");
        return "delete";
    }
}
