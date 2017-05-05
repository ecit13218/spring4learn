package com.smart.proxy;


import org.junit.Test;

/**
 * Created by Administrator on 2017/5/5.
 */
public class ForumServiceTest {
    @Test
    public void proxy(){
        CglibProxy proxy=new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}
