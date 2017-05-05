package com.smart.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * Created by Administrator on 2017/5/5.
 */
public class GreetingInterceptor implements MethodInterceptor {//环绕增强
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args=methodInvocation.getArguments();
        String clientName = (String) args[0];
        System.out.println("Before++++");
        Object obj=methodInvocation.proceed();
        System.out.println("after++++");
        return obj;
    }

}
