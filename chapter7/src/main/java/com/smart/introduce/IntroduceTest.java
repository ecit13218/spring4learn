package com.smart.introduce;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/8.
 */
public class IntroduceTest {
    @Test
    public void introduce(){
        String path="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(path);
        ForumService forumService= (ForumService) ctx.getBean("forumServiceIntroduce");
        forumService.removeForum(10);
        forumService.removeTopic(1022);
        System.out.println("-------------------------------------");
        Monitorable monitorable= (Monitorable) forumService;
        monitorable.setMonitorActive(true);
        forumService.removeForum(10);
        forumService.removeTopic(1022);
    }
}
