import com.aop.api.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangzh on 2016/8/5.
 */
public class AopTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/aopContext.xml");

        Service service = ac.getBean("service",Service.class);

//        Service service = new ServiceImpl();

        service.save("### 1232536 #########");



    }
}
