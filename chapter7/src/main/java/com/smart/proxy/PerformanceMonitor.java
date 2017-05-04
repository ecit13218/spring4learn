package com.smart.proxy;

/**
 * Created by Administrator on 2017/5/3.
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformace> performanceRecord=new ThreadLocal<MethodPerformace>();

    public static void begin(String method){
        System.out.println("begin monitor...");
        MethodPerformace mp=new MethodPerformace(method);
        performanceRecord.set(mp);
    }
    public static void end(){
        System.out.println("end monitor");
        MethodPerformace mp=performanceRecord.get();
        mp.printPerformance();
    }
}
