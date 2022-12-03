package aaron.springcrafter.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:03
 */

public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
