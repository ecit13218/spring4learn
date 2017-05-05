package com.smart.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/5.
 */
public class TransactionManager implements ThrowsAdvice {//异常跑出增强接口没有定义任何方法，它是一个标签接口，
                                                          // 在运行时Spring使用反射机制自己判断，必须采用下面形式定义异常抛出的方法

    public void afterThrowing(Method method,Object[] objects,Object target,Exception ex)throws Throwable{
        System.out.println("---------");
        System.out.println("method:"+method.getName());
        System.out.println("抛出异常"+ex);
        System.out.println("成功回滚事务");
    }
}
