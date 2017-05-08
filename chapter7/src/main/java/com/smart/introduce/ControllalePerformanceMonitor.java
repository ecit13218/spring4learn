package com.smart.introduce;

import com.smart.proxy.PerformanceMonitor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by Administrator on 2017/5/8.
 */
public class ControllalePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable {
   public ThreadLocal<Boolean> MonitorStarusMap=new ThreadLocal<Boolean>();
    public void setMonitorActive(boolean active) {
        MonitorStarusMap.set(active);
    }
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj=null;
        if(MonitorStarusMap.get()!=null&&MonitorStarusMap.get()){
            PerformanceMonitor.begin(mi.getClass().getName()+"."+mi.getMethod().getName());
            obj=super.invoke(mi);
            PerformanceMonitor.end();
        }else{
            obj=super.invoke(mi);
        }
        return obj;
    }
}
