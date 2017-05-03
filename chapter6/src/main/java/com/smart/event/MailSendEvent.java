package com.smart.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * Created by Administrator on 2017/5/3.
 */
public class MailSendEvent extends ApplicationContextEvent {
    private String to;
    public MailSendEvent(ApplicationContext source,String to) {
        super(source);
        this.to=to;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
