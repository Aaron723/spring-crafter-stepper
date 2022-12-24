package aaron.springframework.test.common;

import aaron.springcrafter.springframework.beans.BeansException;
import aaron.springcrafter.springframework.beans.PropertyValue;
import aaron.springcrafter.springframework.beans.PropertyValues;
import aaron.springcrafter.springframework.beans.factory.ConfigurableListableBeanFactory;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;
import aaron.springcrafter.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author Ziqi Wang
 * @date 12/24/22 21:43
 */

public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}

