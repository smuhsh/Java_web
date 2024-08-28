package springFw.ex04.aop01;
/*
 * 작성자: 황석현
 * 작성일: 2024-08-28
 * 개요:	 proxy Design Pattern, 전처리 후처리를 할 수 있다
 * 
 * */

public class HelloServiceProxy extends HelloService {
	
	@Override
	public String sayHello(String name) {
		HelloLog.log();
		
		String result = super.sayHello(name);
		return result;
	}
}
