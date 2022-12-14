package aaron.springcrafter.springframework.beans.factory.support;

import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:15
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;

        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {

        Constructor constructorToUser = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();

        for (Constructor ctor: declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUser = ctor;
                break;
            }
        }

        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUser, args);



    }

    protected InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }


}
