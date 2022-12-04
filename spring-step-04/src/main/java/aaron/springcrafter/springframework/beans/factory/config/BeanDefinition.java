package aaron.springcrafter.springframework.beans.factory.config;

import aaron.springcrafter.springframework.PropertyValue;
import aaron.springcrafter.springframework.PropertyValues;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:10
 */

public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}
