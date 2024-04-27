package com.wubai.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.Collection;

import com.wubai.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author HDL
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-04-23 20:17:14
* @Entity com.wubai.entity.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertBatch(@Param("userCollection") Collection<User> userCollection);
}




