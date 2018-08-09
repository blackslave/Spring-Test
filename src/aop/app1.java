package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app1 {
	public static  void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext rs = new ClassPathXmlApplicationContext("aop/beans.xml");
		TestServiceInter ts = (TestServiceInter)rs.getBean("proxyFactoryBean");
		ts.sayhello();
		((TestServiceInter2)ts).sayBye();
	}
}
