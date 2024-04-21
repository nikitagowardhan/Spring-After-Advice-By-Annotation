import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.PaymentService;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context	= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	PaymentService p =context.getBean("s",PaymentService.class);
	
	p.a();
	p.b();

	}

}
