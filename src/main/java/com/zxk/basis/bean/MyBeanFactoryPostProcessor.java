package com.zxk.basis.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("BeanFactoryPostProcessor 构造方法");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("执行postProcessBeanFactory方法");
        BeanDefinition person = configurableListableBeanFactory.getBeanDefinition("person");
        person.getPropertyValues().addPropertyValue("phone","666");
    }
}
