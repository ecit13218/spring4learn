package com.smart.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/8.
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    public boolean matches(Method method, Class<?> aClass) {
        return "greetTo".equals(method.getName());
    }
    public ClassFilter getClassFilter(){//切点类匹配规则，为Waiter的类或者子类,或者Seller的类或者子类
        return new ClassFilter() {
            public boolean matches(Class<?> aClass) {
                return Waiter.class.isAssignableFrom(aClass)||Seller.class.isAssignableFrom(aClass);
            }
        };
    }
}
