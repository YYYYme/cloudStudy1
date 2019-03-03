package com.link.order.service;

import com.link.order.dto.OrderDTO;
import org.hibernate.criterion.Order;

public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
