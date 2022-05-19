package com.zxk.basis;

import com.zxk.basis.bean.Configure;
import com.zxk.basis.bean.Person;
import com.zxk.basis.proxy.CglibProxy;
import com.zxk.basis.proxy.JdkHandler;
import com.zxk.basis.proxy.service.ProxyService;
import com.zxk.basis.proxy.service.impl.ProxyServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

@SpringBootTest
class BasisApplicationTests {
    @Test
    public void threadLocalTest() throws Exception{
        /*在不同的线程中访问同一个 ThreadLocal 对象的 set 和 get 进行存取数据是不会相互干扰的*/
        ThreadLocal<Object> t = new ThreadLocal<>();
        t.set("test");
        System.out.println(t.get()+":"+Thread.currentThread().getName());
        t.set("test1"+":"+Thread.currentThread().getName());
        System.out.println(t.get());
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.set("test2");
                System.out.println(t.get()+":"+Thread.currentThread().getName());
            }
        }).start();
        System.out.println(t.get()+":"+Thread.currentThread().getName());
    }

    @Test
    void jdkProxyTest() {
        JdkHandler jdkHandler = new JdkHandler();
        ProxyService u = (ProxyService)jdkHandler.newProxy(new ProxyServiceImpl());
        u.add();
    }

    @Test
    void cglibProxyTest(){
        CglibProxy cglibProxy = new CglibProxy();
        ProxyService o = (ProxyService)cglibProxy.NewProxy(new ProxyServiceImpl());
        o.del();
    }

    /*
    * ApplicationContext是Spring中的核心接口和容器，允许容器通过应用程序上下文环境
    * 创建、获取、管理bean。在构建容器的时候，创建对象采用的策略是立即加载的方式，
    * 即只要一读取完配置文件就立即创建配置文件中配置的对象。
    * BeanFactory采用的是延迟加载的方式，什么时候根据id获取对象了，什么时候才真正地创建对象。
     该接口具有三个常用的实现类：
        1、ClassPathXmlApplicationContext：可以加载类路径下的配置文件，要求配置文件必须在类路径之下。
        2、FileSystemXmlApplicationContext：可以加载磁盘中任意路径下的配置文件，要求具有访问权限。
        3、AnnotationConfigApplicationContext：用于读取注解创建容器。
    *
    * */
    @Test
    public void beanTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
        System.out.println("容器初始化成功");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.getAddress()+":"+person.getName()+":"+person.getPhone());
        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId()+":"+threadInfo.getThreadName());
        }
    }
}
