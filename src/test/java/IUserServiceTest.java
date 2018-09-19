import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.domain.User;
import com.ssm.service.UserService;

public class IUserServiceTest {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) application.getBean("userService");
        userService.findByUserId(944560L);
    }
    
}