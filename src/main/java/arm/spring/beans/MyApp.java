package arm.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PaymentProcessor paymentProcessor = (PaymentProcessor) context.getBean("paymentProcessor");
		paymentProcessor.doPayment(181818.18);
	}

}
