package com.link.order.service;

import com.link.order.service.impl.RedisServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {

    @Autowired
    RedisServiceImpl redisService;
    @Test
    public void setContent() {
        redisService.setContent("redisKey", "redisValue");
    }
    @Test
    public void getContent() {
        String redisValue = redisService.getContent("redisKey");
        System.out.println(redisValue);
    }
}