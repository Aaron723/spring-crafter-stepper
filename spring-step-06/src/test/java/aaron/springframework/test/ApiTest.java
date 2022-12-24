package aaron.springframework.test;

import aaron.springcrafter.springframework.beans.factory.support.DefaultListableBeanFactory;
import aaron.springcrafter.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import aaron.springcrafter.springframework.core.io.DefaultResourceLoader;
import aaron.springcrafter.springframework.core.io.Resource;
import aaron.springframework.test.bean.UserService;
import cn.hutool.core.io.IoUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:05
 */

public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        UserService userService = beanFactory.getBean("userService", UserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }


    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");

        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_url() throws IOException {
        Resource resource = resourceLoader.getResource("https://raw.githubusercontent.com/Aaron723/spring-crafter-stepper/master/spring-step-05/src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }


}
