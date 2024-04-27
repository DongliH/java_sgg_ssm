package com.wubai.test;


import com.wubai.entity.Employee;
import com.wubai.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void  test01() throws IOException {
        //1.读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis.xml");
        //2,创建sqlsessionfactory 通过
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.queryById(1);
        System.out.println(employee);
        sqlSession.close();
    }
}
