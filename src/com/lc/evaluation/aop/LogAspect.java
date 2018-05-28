package com.lc.evaluation.aop;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(4)
public class LogAspect {

	private HttpServletRequest request;

	public HttpServletRequest getRequest() {
		return request;
	}

	@Autowired
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	private final Logger logger = LogManager.getLogger(this.getClass().getName());
	
	private String logStr = null;

	/**
	 * 前置通知：在某连接点之前执行的通知，但这个通知不能阻止连接点前的执行
	 * 
	 * @param jp
	 *            连接点：程序执行过程中的某一行为
	 */
	@Pointcut("execution(public * com.lc.evaluation.control.student.StudentOnlineStatusController.login(..))")
	private void myMethod() {
	}// 定义一个切入点

	public LogAspect() {
		
	}

	@Before("myMethod()")
	public void doBefore(JoinPoint jp) {
		System.out.println("---------------------------------------");
		logStr = "\n=======请求参数开始=======\n";
		for(String key: request.getParameterMap().keySet()){
			logStr += key + " = " + request.getParameter(key) + "\n";
		}
		logStr += "=======请求参数结束=======\n";
		logger.info(logStr);
		
		logStr = "\nIP地址为：" + request.getRemoteHost() + "访问 -> " + "用户名为："
				+ request.getSession().getAttribute("userName") + "\n" + jp.getTarget().getClass().getName() + "类的"
				+ jp.getSignature().getName() + "方法开始执行******Start******";
		logger.info(logStr);
	}

	/**
	 * 环绕通知：包围一个连接点的通知，可以在方法的调用前后完成自定义的行为，也可以选择不执行。
	 * 类似web中Servlet规范中Filter的doFilter方法。
	 * 
	 * @param pjp
	 *            当前进程中的连接点
	 * @return
	 * @throws Throwable
	 */
	@Around("myMethod()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		long Time1 = System.currentTimeMillis();
		result = pjp.proceed();
		long Time2 = System.currentTimeMillis();
		logStr = "\n耗时：" + (Time2 - Time1) + " ms";
		logger.info(logStr);
		return result.toString();
	}

	/**
	 * 后置通知
	 * 
	 * @param jp
	 */
	@After("myMethod()")
	public void doAfter(JoinPoint jp) {
		logStr = "\n" + jp.getTarget().getClass().getName() + "类的" + jp.getSignature().getName()
				+ "方法执行结束******End******";
		logger.info(logStr);
	}

	@AfterThrowing(throwing = "ex", value = "myMethod()")
	public void doRecoveryActions(Throwable ex) {
		logStr = "错误信息如下：[" + ex + "]";
		ex.printStackTrace();
		logger.error(logStr);
	}

}