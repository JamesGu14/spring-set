package cn.sxt.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
	
	@Before("execution(* cn.sxt.service.impl.*.*(..))")
	public void before() {
		System.out.println("-----Before function-----");
	}
	
	@After("execution(* cn.sxt.service.impl.*.*(..))")
	public void after() {
		System.out.println("-----After function-----");
	}
	
	@Around("execution(* cn.sxt.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("First Thing");
		System.out.println("Second Thing " + jp.getSignature());
		
		// 执行目标方法
		Object result = jp.proceed();
		System.out.println("Last Thing");
		return result;
	}
}
