package test;


import com.wubai.entity.Employee;
import com.wubai.entity.Teacher;
import com.wubai.mapper.EmployeeMapper;
import com.wubai.mapper.TeacherMapper;
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
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setEmpSalary(11000.1);
        employee.setEmpName("谢文龙");
        System.out.println(employee.getEmpId());
        int i = mapper.insertEmp(employee);
        System.out.println("-----------------");
        System.out.println("row"+i);
        System.out.println("-----------------");
        System.out.println(employee.getEmpId());

        sqlSession.close();
    }
    @Test
    public void  test02() throws IOException {
        //1.读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis.xml");
        //2,创建sqlsessionfactory 通过
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = new Teacher();
        teacher.settName("liuzhiyu");
        System.out.println(teacher.gettId());
        int i = mapper.insertTeacher(teacher);
        System.out.println("-----------------");
        System.out.println("row="+i);
        System.out.println("-----------------");
        System.out.println(teacher.gettId());

        sqlSession.close();
    }
}
