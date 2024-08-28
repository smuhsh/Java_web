package springFw.ex03.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller //컨트롤러 주입해줘야 한다
public class HelloController {
	
	@Autowired //객체가 없어도 오류가 안나는 이유?
	IHelloService helloService; //Interface 는 약속이다, 인터페이스 했을 때 무조건 그 메서드가 있음을 알려준다, 컴파일러가 인식한다
	
	//@Autowired
	//IHelloService niceHelloService;
	
	
	//이렇게 하면 실제로 niceHelloService 이 주입된다
	//@Autowired
	//@Qualifier("niceHelloService")
	//IHelloService helloService;
	
	public void hello(String name) {
		System.out.println("HelloController: "+helloService.sayHello(name));
		//System.out.println("HelloController: "+niceHelloService.sayHello(name));
	}

}
