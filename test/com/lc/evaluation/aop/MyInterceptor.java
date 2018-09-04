package com.lc.evaluation.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyInterceptor {
	
    @Pointcut("execution (* com.lc.evaluation.aop.PersonServiceImpl.*(..))")
    private void anyMethod() {} // 声明一个切入点，anyMethod为切入点名称

    
    public MyInterceptor() {
    	System.out.println("");
	}
    
    // 声明该方法是一个前置通知：在目标方法开始之前执行 
    @Before("anyMethod()")
    public void doAccessCheck() {
        System.out.println("前置通知");
    }

    @AfterReturning("anyMethod()")
    public void doAfterReturning() {
        System.out.println("后置通知");
    }

    @After("anyMethod()")
    public void doAfter() {
        System.out.println("最终通知");
    }
}