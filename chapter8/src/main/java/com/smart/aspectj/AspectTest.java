package com.smart.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/9.
 */
public class AspectTest {
    public static void main(String[] args) {
        String path="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(path);
        Waiter waiter= (Waiter) ctx.getBean("waiter");
        waiter.greetTo("zhengyao");
        waiter.serveTo("zy");
        waiter.testWaiter(waiter);
    }
}
