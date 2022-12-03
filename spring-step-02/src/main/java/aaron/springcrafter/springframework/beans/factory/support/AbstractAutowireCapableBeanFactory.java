package aaron.springcrafter.springframework.beans.factory.support;

import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:15
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;

        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

}
