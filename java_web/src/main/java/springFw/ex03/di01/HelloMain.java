package springFw.ex03.di01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		//의존성 기술 (객체를 생성한것...)
		//HelloController helloController = new HelloController();
		//HelloController helloController = new HelloController(new HelloService());
		
		//HelloController helloController = new HelloController();
		//helloController.setHelloService(new HelloService());
		
		//Sprig DI, xml
		AbstractApplicationContext context 
			= new GenericXmlApplicationContext("classpath:config/di01/application-config.xml");
		
		//new
		//HelloService helloController = context.getBean("helloservice",HelloService.class); //최상위 Object 객체로 관리하기 때문에 class를 사용함
		
		//생성자
		//HelloController helloController = context.getBean("helloController",HelloController.class); //최상위 Object 객체로 관리하기 때문에 class를 사용함
		
		//Setter
		//HelloController helloController = context.getBean("helloController2",HelloController.class); 		
		
		HelloController helloController = context.getBean("helloController3",HelloController.class); 		
		helloController.hello("홍길동");

	}

}
