import com.wubai.controller.StudentController;
import config.JavaConfiguration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfiguration.class)  //指定配置类
public class Junit5IntegrationTest {
    
    @Autowired
    private StudentController st;

    @Test
    public void testJunit5() {
        st.queryAll();
    }
}