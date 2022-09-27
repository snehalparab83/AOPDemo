package com.example.SpringAOPApp;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.AfterAdvice;


import java.lang.reflect.Method;

public class HijackBeforeMethod implements MethodInterceptor {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked !");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked !");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method name : "+methodInvocation.getMethod().getName());
        System.out.println("Method arguments : "+methodInvocation.getArguments());
        System.out.println("HijackAroundMethod : Before method hijacked");

        try{
            Object result = methodInvocation.proceed();
            System.out.println("HijackAroundMethod : Before method hijacked ! ");
        }
        catch (Exception e)
        {
            System.out.println(e.fillInStackTrace());
        }
        return null;
    }
}
