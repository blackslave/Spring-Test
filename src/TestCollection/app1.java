package TestCollection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
	public static  void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext rs = new ClassPathXmlApplicationContext("TestCollection/beans.xml");
		Department Department = (Department)rs.getBean("Department");
		System.out.println(Department.getName());
		System.out.println("�ʉ�Array��o");
		for(String empname:Department.getEmpname())
		{
			System.out.println(empname);
		}
		System.out.println("�ʉ�list��o");
		for(Employee e:Department.getEmplist())
		{
			System.out.println(e.getId()+" "+e.getName());
		}
		System.out.println("�ʉ�set��o");
		for(Employee e:Department.getEmpset())
		{
			System.out.println(e.getId()+" "+e.getName());
		}
		System.out.println("�ʉ�Map��o");
		for(Entry<String,Employee> Entry1:Department.getEmpMap().entrySet())
		{
			System.out.println(Entry1.getKey()+" "+Entry1.getValue().getName());
		}
		System.out.println("�ʉ�Map�R����o");
		Map<String,Employee> empMap =Department.getEmpMap();
		Iterator<String> it=empMap.keySet().iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			Employee emp=empMap.get(key);
			System.out.println("key="+key+" "+emp.getName());
		}
		System.out.println("�ʉ�Properties��o");		
		Properties pp=Department.getPp();
		for(Entry<Object,Object> Entry1:pp.entrySet())
		{
			System.out.println(Entry1.getKey().toString()+" "+Entry1.getValue().toString());
		}
		System.out.println("�ʉ�Enumeration��o");	
		Enumeration<Object> en=pp.keys();
		while(en.hasMoreElements())
		{
			String key=(String) en.nextElement();
			System.out.println(key+" "+pp.getProperty(key));
		}
	}
}
