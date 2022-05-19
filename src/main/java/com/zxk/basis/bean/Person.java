package com.zxk.basis.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person implements BeanFactoryAware,BeanNameAware,
        InitializingBean,DisposableBean {
    public Person() {
        System.out.println("Person 构造器");
    }

    private String name;

    private String address;

    private String phone;

    private BeanFactory beanFactory;

    private String beanName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("注入属性 name"+name);
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("注入属性 address"+ address);
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("注入属性 phone"+phone);
        this.phone = phone;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware:setBeanFactory");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware:setBeanName");
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destory方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet方法");
    }

    public void myInit(){
        System.out.println("---init---");
    }

    public void myDestory(){
        System.out.println("---destory---");
    }
}
