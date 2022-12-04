package aaron.springframework.test;
import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.PropertyValue;
import aaron.springcrafter.springframework.PropertyValues;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;
import aaron.springcrafter.springframework.beans.factory.config.BeanReference;
import aaron.springcrafter.springframework.beans.factory.support.DefaultListableBeanFactory;
import aaron.springframework.test.bean.UserDao;
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

        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("uid", "1001"));

        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}
