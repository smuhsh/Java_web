package springFw.ex04.aop01;

//2
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		// 1) 코드
		//System.out.println(">>> Log :"+new java.util.Date());
		
		// 2) 분리
		//HelloLog.log(); //util class 라고한다
		
		System.out.println("HelloService.sayHello() 메서드 실행");
		String message = "Helo~~"+name;
		return message;
	}
	
	@Override
	public String sayGoodBye(String name) {
		
		System.out.println("HelloService.sayGoodBye() 메서드 실행");
		String message = "GoodBye~~"+name;
		return message;
	}

}
