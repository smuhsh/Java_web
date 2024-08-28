package springFw.ex04.aop01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		//Sprig DI, xml
		AbstractApplicationContext context;
		context = new GenericXmlApplicationContext("classpath:config/aop01/application-config.xml");
		
		HelloController controller = context.getBean("helloController",HelloController.class);
		controller.hello("홍길동");
		
		context.close();

	}

}
