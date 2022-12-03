package aaron.springframework.test;

import aaron.springcrafter.springframework.BeanDefinition;
import aaron.springcrafter.springframework.BeanFactory;
import aaron.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:05
 */

public class ApiTest {

    @Test
    public void test_BeanFactory() {

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}
