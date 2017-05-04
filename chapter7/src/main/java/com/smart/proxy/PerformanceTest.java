package com.smart.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/5/4.
 */
public class PerformanceTest {
    public static void main(String[] args) {
        PerformanceHandler per=new PerformanceHandler(new ForumServiceImpl());
        ForumService fs= (ForumService) Proxy.newProxyInstance(per.getClass().getClassLoader(),new Class[]{ForumService.class},per);
        fs.removeTopic(10);
        fs.removeForum(1012);

    }
}
