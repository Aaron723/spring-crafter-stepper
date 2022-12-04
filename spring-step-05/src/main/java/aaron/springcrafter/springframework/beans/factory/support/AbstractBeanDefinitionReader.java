package aaron.springcrafter.springframework.beans.factory.support;

import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.core.io.DefaultResourceLoader;
import aaron.springcrafter.springframework.core.io.Resource;
import aaron.springcrafter.springframework.core.io.ResourceLoader;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:05
 */

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }


    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
