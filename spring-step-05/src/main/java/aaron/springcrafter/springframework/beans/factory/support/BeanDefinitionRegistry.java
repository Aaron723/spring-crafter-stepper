package aaron.springcrafter.springframework.beans.factory.support;

import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:16
 */

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();

}
