import com.wubai.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest02 {



    @Test
    public void testRun() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-02.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();

    }

}
