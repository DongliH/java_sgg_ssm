package com.wubai.mapper;

import com.wubai.entity.Customer;

import java.util.List;

public interface CustomerMapper {
    //根据客户查询所有订单
    List<Customer> queryAllOrderByCustmer();
}
