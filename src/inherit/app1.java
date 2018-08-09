package inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
	public static  void main(String[] args){
		ApplicationContext rs = new ClassPathXmlApplicationContext("inherit/beans.xml");
		Graduate Graduate = (Graduate)rs.getBean("Graduate");
		System.out.println(Graduate.getName()+" "+Graduate.getAge()+" "+Graduate.getDegree());
	}
}