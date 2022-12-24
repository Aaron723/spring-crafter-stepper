package aaron.springcrafter.springframework.context.support;

import aaron.springcrafter.springframework.beans.factory.support.DefaultListableBeanFactory;
import aaron.springcrafter.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Convenient base class for {@link aaron.springcrafter.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link XmlBeanDefinitionReader}.

 */

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}