package com.wubai.mapper;

import com.wubai.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> queryAll();

    int delete(int i);
}
