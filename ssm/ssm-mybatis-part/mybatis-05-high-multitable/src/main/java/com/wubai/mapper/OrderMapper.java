package com.wubai.mapper;

import com.wubai.entity.Order;

public interface OrderMapper {
    //根据订单id查询订单以及订单对应的客户信息
    Order queryOrderById(Integer id);
}
