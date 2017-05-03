package com.smart.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/3.
 */
public class MailSenderTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        MailSender mailSender= (MailSender) ctx.getBean("mailSender");
        mailSender.sendMail("zhengyao3@yonyou.com");
    }
}
