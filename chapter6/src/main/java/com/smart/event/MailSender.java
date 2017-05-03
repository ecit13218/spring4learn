package com.smart.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2017/5/3.
 */
//如果需要具有发布事件的能力，就必须要实现ApplicationContextAware接口
public class MailSender implements ApplicationContextAware {
    private ApplicationContext ctx;
    //ApplicationContextAware的接口方法，以便在容器启动时注入容器实例
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx=applicationContext;
    }
    public void sendMail(String to){
        System.out.println("发送邮件"+to);
        MailSendEvent mse=new MailSendEvent(this.ctx,to);
        ctx.publishEvent(mse);//向容器中的所有事件监听者发送事件
    }
}
