package aaron.springcrafter.springframework.beans.factory;

import aaron.springcrafter.springframework.beans.BeansException;
import aaron.springcrafter.springframework.beans.factory.config.AutowireCapableBeanFactory;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;
import aaron.springcrafter.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:08
 */

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}
