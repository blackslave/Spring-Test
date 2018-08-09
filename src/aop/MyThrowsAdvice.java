package aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method m,Object[] os,Object target,Exception throwable)
	{
		System.out.println("出異常了! "+throwable.getMessage());
	}
}
