package com.link.order.service.impl;

import com.link.order.dataObject.OrderMaster;
import com.link.order.dto.OrderDTO;
import com.link.order.enums.OrderStatusEnum;
import com.link.order.enums.PayStatusEnum;
import com.link.order.repository.OrderDetailRepository;
import com.link.order.repository.OrderMasterRepository;
import com.link.order.service.OrderService;
import com.link.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderId(KeyUtil.genUniqueKey());
        orderMasterRepository.save(orderMaster);
        return null;
    }
}
