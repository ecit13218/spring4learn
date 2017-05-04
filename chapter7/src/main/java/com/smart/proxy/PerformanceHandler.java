package com.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/4.
 */
public class PerformanceHandler implements InvocationHandler {
    private Object obj;

    public PerformanceHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(obj.getClass().getName()+"."+method.getName());
        Object result = method.invoke(obj, args);
        PerformanceMonitor.end();
        return result;
    }
}
