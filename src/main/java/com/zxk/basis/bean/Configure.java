package com.zxk.basis.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import({Person.class})
public class Configure {
    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean(initMethod = "myInit",destroyMethod = "myDestory")
    public Person person(){
        Person person = new Person();
        person.setName("zxk");
        person.setPhone("888");
        person.setAddress("sz");
        return person;
    }
}
