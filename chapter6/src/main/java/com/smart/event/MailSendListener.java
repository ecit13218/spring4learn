package com.smart.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/5/3.
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    //对MailSendEvent事件进行处理
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        MailSendEvent event=mailSendEvent;
        System.out.println("监听事件启动，向"+event.getTo()+"发送邮件");
    }
}
