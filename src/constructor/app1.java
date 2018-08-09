package constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class app1 {
	public static  void main(String[] args){
		
		ApplicationContext rs = new ClassPathXmlApplicationContext("constructor/beans.xml");
		Employee Employee = (Employee)rs.getBean("Employee");
//Žg—pBeanFactory‘nŒš
/*		BeanFactory rs = new XmlBeanFactory(
				new ClassPathResource("constructor/beans.xml"));
		Employee Employee = (Employee)rs.getBean("Employee");
*/		
		System.out.println(Employee.getName());
	}
}