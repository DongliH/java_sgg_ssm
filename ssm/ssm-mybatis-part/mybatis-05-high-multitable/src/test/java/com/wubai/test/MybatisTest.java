package com.wubai.test;

import com.wubai.entity.Customer;
import com.wubai.entity.Order;
import com.wubai.mapper.CustomerMapper;
import com.wubai.mapper.OrderMapper;
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

    @Test
    public void testToOne(){
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.queryOrderById(1);
        System.out.println(order);
    }

    @Test
    public void testToMutiple(){

        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.queryAllOrderByCustmer();
        System.out.println(customers);

    }
}
