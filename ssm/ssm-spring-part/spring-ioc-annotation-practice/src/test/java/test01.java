import com.wubai.controller.StudentController;
import config.JavaConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
 @Test
    public void test1(){
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
//        StudentController bean = classPathXmlApplicationContext.getBean(StudentController.class);
//        bean.queryAll();


    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext( JavaConfiguration.class);

     StudentController bean = annotationConfigApplicationContext.getBean(StudentController.class);
     bean.queryAll();

 }
}
