package springFw.ex04.aop01;

public class HelloLog {
	
	public static void log() { //static 으로 생성한 메서드를 class 메서드 라고한다
		System.out.println(">>> Log :"+new java.util.Date());
	}

}
