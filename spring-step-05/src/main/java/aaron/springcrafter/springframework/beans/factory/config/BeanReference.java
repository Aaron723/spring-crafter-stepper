package aaron.springcrafter.springframework.beans.factory.config;

/**
 * @author Ziqi Wang
 * @date 12/4/22 14:33
 */

public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
