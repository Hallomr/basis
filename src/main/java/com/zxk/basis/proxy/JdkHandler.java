package com.zxk.basis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkHandler implements InvocationHandler {
    //需要代理的目标对象
    private Object target;

    public Object newProxy(Object target){
        //将目标对象传入进行代理
        this.target = target;
        //返回代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        check();
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    private void check(){
        System.out.println("----Jdk check-----");
    }
}
