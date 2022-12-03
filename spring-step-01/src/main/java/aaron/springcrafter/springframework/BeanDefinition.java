package aaron.springcrafter.springframework;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:03
 */

public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
