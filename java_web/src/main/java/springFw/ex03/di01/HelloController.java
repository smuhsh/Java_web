package springFw.ex03.di01;

public class HelloController {

	//의존성 생성(new)
	//IHelloService helloService = new HelloService();
	
	//생성자
	IHelloService helloService;
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	//의존성 setter
	public HelloController() {}
	
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	public void hello(String name) {
		System.out.println("HelloController :"+helloService.sayHello(name));
	}
	
}
