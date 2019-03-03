package com.link.order.repository;

import com.link.order.OrderApplicationTests;
import com.link.order.dataObject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Test
    public void getOrderDetail(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123");
        orderDetail.setOrderId("123d");
        orderDetail.setProductIcon("123d");
        orderDetail.setProductId("123d");
        orderDetail.setProductName("123d");
        orderDetail.setProductPrice(new BigDecimal("123"));
        orderDetail.setProductQuantity(123);
        OrderDetail save = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(save != null);
    }
}