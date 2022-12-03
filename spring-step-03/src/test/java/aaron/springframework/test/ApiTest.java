package aaron.springframework.test;
import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;
import aaron.springcrafter.springframework.beans.factory.support.DefaultListableBeanFactory;
import aaron.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:05
 */

public class ApiTest {

    @Test
    public void test_BeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService)  beanFactory.getBean("userService", "aaron");

        userService.queryUserInfo();
    }
}
