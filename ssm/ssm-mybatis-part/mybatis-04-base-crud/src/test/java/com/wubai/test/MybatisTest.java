package com.wubai.test;

import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private SqlSession sqlSession;
    // junit会在每一个@Test方法前执行@BeforeEach方法

    @BeforeEach
    public void init() throws IOException {
        //1.读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis.xml");
        //2,创建sqlsessionfactory 通过
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
         sqlSession = sqlSessionFactory.openSession(true);
    }

    @AfterEach
    public void clear() {

        sqlSession.close();
    }

//    int insert(User user);
//
//    int update(User user);
//
//    int delete(Integer id);
//
//    User selectById(Integer id);
//
//    List<User> selectAll();
    @Test
    public void  test_insert() throws IOException {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("wubai");
        user.setPassword("2111");
        int insert = mapper.insert(user);
        System.out.println("row="+insert);
    }
    @Test
    public void  test_update() throws IOException {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setUsername("xwl");
        user.setPassword("222");
        int update = mapper.update(user);
        System.out.println("row="+update);
    }
    @Test
    public void  test_delete() throws IOException {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int update = mapper.delete(1);
        System.out.println("row="+update);
    }
    @Test
    public void  test_selectById() throws IOException {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectById(1);
        System.out.println(user);
    }
    @Test
    public void  test_selectAll() throws IOException {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectAll();
        System.out.println(users);
    }
}
