package aaron.springcrafter.springframework.beans.factory.config;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:14
 * 单例注册表
 */

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
