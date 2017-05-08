package com.smart.advisor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/8.
 */
public class DynamicAdvisorTest {
    @Test
    public  void dynamicTest(){
        String path= "com/smart.advisor/advisor.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(path);
        Waiter waiter= (Waiter) ctx.getBean("waiter2");
        waiter.serveTo("zhengyao");
        waiter.greetTo("zy");
        System.out.println("*********************************");
        waiter.greetTo("John");
        waiter.serveTo("Tom");
    }
}
