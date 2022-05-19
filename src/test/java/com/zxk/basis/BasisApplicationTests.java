package com.zxk.basis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasisApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() throws Exception{
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
}
