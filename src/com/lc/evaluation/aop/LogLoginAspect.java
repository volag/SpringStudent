package com.lc.evaluation.aop;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;

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

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dao.LogMapper;
import com.lc.evaluation.entity.Log;
import com.lc.evaluation.entity.User;

@Aspect
@Component
@Order(4)
public class LogLoginAspect {

	private HttpServletRequest request;
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	@Autowired
	private LogMapper logMapper;

	@Autowired
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * 前置通知：在某连接点之前执行的通知，但这个通知不能阻止连接点前的执行
	 * @param jp
	 *            连接点：程序执行过程中的某一行为
	 */
	@Pointcut("execution(public * com.lc.evaluation.control..login(..))")
	private void myMethod() {
	}// 定义一个切入点

	public LogLoginAspect() {
		
	}
	
	Map<String , Log> logMap = new ConcurrentHashMap<String, Log>();
	
	static String userName = "userName";

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
		
		Log log = new Log();
		logMap.put(request.getParameter(userName), log);
		log.setUserName(request.getParameter(userName));
		//日志的执行方法
		log.setAction(pjp.getSignature().getName());
		log.setIsSuccess(true);
		Object result = null;
		log.setStartTime(new Date());
		result = pjp.proceed();
		log.setEndTime(new Date());
		
		User user = (User) request.getSession().getAttribute(UserType.userType);
		if(user != null){
			log.setRealName(user.getRealName());
			log.setUserType(user.getUserType());
		}else{
			log.setIsSuccess(false);
		}
		logMapper.add(log);
		logMap.remove(request.getParameter(userName));
		return result.toString();
	}
}