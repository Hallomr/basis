package com.zxk.basis.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object NewProxy(Object o){
        this.target = o;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(o.getClass());
        enhancer.setCallback(this);
        Object o1 = enhancer.create();
        return o1;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        check();
        Object invoke = method.invoke(target, objects);
        return invoke;
    }

    private void check(){
        System.out.println("---Cglib check---");
    }
}
