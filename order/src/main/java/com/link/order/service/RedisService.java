package com.link.order.service;

public interface RedisService {

    void setContent(String key,String value);

    String getContent(String key);
}
