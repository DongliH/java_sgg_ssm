package com.wubai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import com.wubai.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
