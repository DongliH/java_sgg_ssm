package generator.mapper;

import generator.com.wubai.entity.User;

/**
* @author HDL
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-04-16 16:34:13
* @Entity generator.com.wubai.entity.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
