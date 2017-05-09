package com.smart.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2017/5/9.
 */
@Aspect
public class TestNamePointcut {
    @Pointcut("within(com.smart..*)")
    private void inPackage(){}
    @Pointcut("target(com.smart.aspectj.Waiter)")
    protected void greetTo(){}
    @Pointcut("inPackage() && greetTo()")
    public void inPackageTo(){}

    @Before("inPackageTo()")
    public void beforeAdvice(JoinPoint joinPoint){
//        System.out.println("How are you");
//        System.out.println(joinPoint.getArgs());//获取连接点方法运行时的入参列表
//        System.out.println(joinPoint.getSignature());//获取连接点的方法的签名对象
//        System.out.println(joinPoint.getTarget());//获取连接点所在的目标对象
//        System.out.println(joinPoint.getThis());//获取代理对象本身

    }
    @Around("execution(* greetTo(String))")
    public void arountJoinPointAccess(ProceedingJoinPoint joint) throws Throwable {
//        System.out.println("before");
        joint.proceed();//通过反射执行目标对象连接点的方法
//        joint.proceed(new String[]{"反射"});//通过新入参取代旧入参
//        System.out.println("after");
    }
    @After("execution (* serveTo(..)) && args(name)")//通过args()绑定连接点参数
    public void afterAdvice(String name){
        System.out.println(name+" --after");
    }
    @After("this(waiter)")//通过this()或者target()绑定被代理对象实例
    public void afterAdvice(Waiter waiter){
        System.out.println(waiter+" --after");
    }

}
