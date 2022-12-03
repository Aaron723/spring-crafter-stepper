package aaron.springcrafter.springframework.beans.factory.config;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:10
 */

public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }
}
