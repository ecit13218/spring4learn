package com.smart.aspectj;

/**
 * Created by Administrator on 2017/5/5.
 */
public class WaiterImpl implements Waiter {
    public void greetTo(String name) {
        System.out.println("greet to "+name);
    }

    public void serveTo(String name) {
        System.out.println("serve to"+name);
    }
}
