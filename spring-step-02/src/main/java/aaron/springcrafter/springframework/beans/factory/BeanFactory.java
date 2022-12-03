package aaron.springcrafter.springframework.beans.factory;

import aaron.springcrafter.springframework.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
