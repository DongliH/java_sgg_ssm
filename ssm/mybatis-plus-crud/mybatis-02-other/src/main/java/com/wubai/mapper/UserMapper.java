package com.wubai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wubai.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper extends BaseMapper<User> {

     IPage<User> queryByAge(IPage<User> page, @Param("age") Integer age);

}
