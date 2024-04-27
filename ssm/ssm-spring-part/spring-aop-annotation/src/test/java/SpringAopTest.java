import com.wubai.JavaConfig;
import com.wubai.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {
    @Autowired
    private Calculator calculator;
    @Test
    public void  test01(){
        int add = calculator.add(1, 1);
        System.out.println(add);
    }
}
