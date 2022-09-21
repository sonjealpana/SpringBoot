package springIoc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("bean.xml");
		Airtel a1=(Airtel)c.getBean("airtel1");
		a1.calling();
		a1.data();
		Jio j1=c.getBean("jio1",Jio.class);
		j1.calling();
		j1.data();
	}

}
