/*
package com.smart.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by Administrator on 2017/5/8.
 *//*

public class GreetingDynamicPointCut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList=new ArrayList<String>();
    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }
    public ClassFilter getClassFilter(){
        return  new ClassFilter() {
            public boolean matches(Class<?> aClass) {
                System.out.println("调用getClassFilter()对"+aClass.getName()+"做静态检查");
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }
    public boolean matches(Method method, Class<?> aClass, Object[] objects) {
        System.out.println("调用matches()"+aClass.getName()+"."+method.getName()+"动态检查");
        String clientName= (String) objects[0];
        return specialClientList.contains(clientName);
    }
    public boolean matches(Method method, Class<?> aClass) {
        System.out.println("调用matches()"+aClass.getName()+"."+method.getName()+"静态检查");
        return "greetTo".equals(method.getName());
    }
}
*/
