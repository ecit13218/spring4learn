package com.smart.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/8.
 */
public class ControlFlowTest {
    public static void main(String[] args) {
        String path= "com/smart.advisor/advisor.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(path);
        Waiter waiter= (Waiter) ctx.getBean("waiter3");
        WaiterDelegate delegate=new WaiterDelegate();
        delegate.setWiter(waiter);
        waiter.greetTo("peter");
        waiter.serveTo("Peter");
        System.out.println("************************************");
        delegate.service("Peter");
    }
}
