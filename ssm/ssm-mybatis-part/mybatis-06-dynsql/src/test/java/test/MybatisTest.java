package test;


import com.wubai.entity.Employee;


import com.wubai.mapper.EmployeeMapper;

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
    public void test01(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectEmployeeByCondition(null, 100.0);
        System.out.println(employees);

    }

    @Test
    public void test02(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setEmpName("wuabi");
        employee.setEmpSalary(1000.1);
        int update = mapper.update(employee);
        System.out.println(update);


    }
    @Test
    public void testTrim(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employees = mapper.selectEmployeeByConditionTrim(null, 100.0);
        System.out.println(employees);


    }
    @Test
    public void testChoose(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employees = mapper.queryChoose(null, null);
        System.out.println(employees);


    }
}
