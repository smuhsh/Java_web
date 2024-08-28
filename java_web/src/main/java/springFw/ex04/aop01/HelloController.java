package springFw.ex04.aop01;

public class HelloController {
	
	IHelloService helloservice;
	
	public HelloController() {}
	
    public HelloController(IHelloService helloService) {
        this.helloservice = helloService;
    }
	
	public void setHelloService(IHelloService helloService) {
		this.helloservice = helloService;
	}
	
	public void hello(String name) {
		System.out.println("HelloController: "+this.helloservice.sayHello(name));
	}
}
