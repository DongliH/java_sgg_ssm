import com.wubai.ProxyFactory;
import com.wubai.statics.Calculator;
import com.wubai.statics.CalculatorImpl;
import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    public void  test01(){
        Calculator calculator1 = new CalculatorImpl();
        ProxyFactory proxyFactory = new ProxyFactory(calculator1);
        Calculator  proxy1 = ( Calculator)proxyFactory.getProxy();
        proxy1.add(1,1);

    }

}
