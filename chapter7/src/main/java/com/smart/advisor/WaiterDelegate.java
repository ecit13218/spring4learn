package com.smart.advisor;

/**
 * Created by Administrator on 2017/5/8.
 */
public class WaiterDelegate {
    private Waiter waiterDelegate;
    public void service(String clientName){
        waiterDelegate.serveTo(clientName);
        waiterDelegate.greetTo(clientName);
    }
    public void setWiter(Waiter waiterDelegate){
        this.waiterDelegate=waiterDelegate;
    }
}
