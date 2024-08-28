package springFw.ex03.di03;

import org.springframework.stereotype.Service;

//2
@Service
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		
		System.out.println("HelloService.sayHello() 메서드 실행");
		String message = "Helo~~"+name;
		
		return message;
	}

}
