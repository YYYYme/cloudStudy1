package com.link.order.service.impl;

import com.link.order.service.RedisService;
import com.link.order.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    RedisUtil redisUtil;

    @Override
    public void setContent(String key,String value) {
        redisUtil.set(key, value);
    }

    @Override
    public String getContent(String key) {
        String value = (String) redisUtil.get(key);
        return value;
    }
}
