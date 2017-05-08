package com.smart.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/8.
 */
public class AdvisorTest {
    public static void main(String[] args) {
        String path= "com/smart.advisor/advisor.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(path);
        Seller seller= (Seller) ctx.getBean("seller");
        Waiter waiter= (Waiter) ctx.getBean("waiter");
        seller.greetTo("zhengyao");
        waiter.greetTo("zy");
        waiter.serveTo("zhengyao3");
    }
}
