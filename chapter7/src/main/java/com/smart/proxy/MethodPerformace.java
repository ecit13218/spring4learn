package com.smart.proxy;

/**
 * Created by Administrator on 2017/5/4.
 */
public class MethodPerformace {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformace(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin=System.currentTimeMillis();
    }
    public void printPerformance(){
        end=System.currentTimeMillis();
        long elapse=begin-end;
        System.out.println(serviceMethod+"花费"+elapse+"毫秒");
    }
}
