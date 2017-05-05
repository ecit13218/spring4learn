package com.smart.advice;

import com.smart.concept.Forum;
import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/5.
 */
public class BeforeAdviceTest {
    @Test
    public void before(){
        Waiter waiter=new WaiterImpl();
        BeforeAdvice advice=new GreetingBeforeAdvice();//前置通知
        ProxyFactory proxy=new ProxyFactory();//Spring提供的代理工厂
        proxy.setTarget(waiter);//设置代理目标
        proxy.addAdvice(advice);
        Waiter pf= (Waiter) proxy.getProxy();
        pf.greetTo("zhengyao");
        pf.serveTo("gf");
    }
    @Test
    public void beforeXML(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter waiter= (Waiter) ctx.getBean("waiter");
        waiter.serveTo("zhengyao");
        waiter.greetTo("gf");
    }
    @Test
    public void exceptionAdvice(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        ForumService forumService= (ForumService) ctx.getBean("exceptionBean");
        forumService.removeForum(10);
        forumService.updateForum(new Forum());
    }
}
