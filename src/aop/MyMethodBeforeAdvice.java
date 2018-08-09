package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	/**Method:被調用的方法名字
	 * arg1：給Method傳遞的參數
	 * arg2：目標對象
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("**************************");
		System.out.println("記錄日誌..."+ arg0.getName());
	}

}
