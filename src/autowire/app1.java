package autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
	public static  void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext rs = new ClassPathXmlApplicationContext("autowire/beans.xml");
		master master = (master)rs.getBean("master");
		System.out.println(master.getName()+" "+master.getDog().getName());
	}
}
