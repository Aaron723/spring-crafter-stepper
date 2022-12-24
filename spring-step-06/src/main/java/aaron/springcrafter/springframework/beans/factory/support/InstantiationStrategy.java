package aaron.springcrafter.springframework.beans.factory.support;

import aaron.springcrafter.springframework.beans.BeansException;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author Ziqi Wang
 * @date 12/4/22 02:22
 */

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor
            ctor, Object[] args) throws BeansException;


}
