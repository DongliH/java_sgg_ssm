package com.wubai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wubai.entity.User;
import com.wubai.service.UserService;
import com.wubai.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author HDL
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-04-23 20:17:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




