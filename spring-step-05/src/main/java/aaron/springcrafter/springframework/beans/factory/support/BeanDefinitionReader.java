package aaron.springcrafter.springframework.beans.factory.support;

import aaron.springcrafter.springframework.BeansException;
import aaron.springcrafter.springframework.core.io.Resource;
import aaron.springcrafter.springframework.core.io.ResourceLoader;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:05
 */

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource ... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
