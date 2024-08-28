package springFw.ex02.dp04;

public class Singleton {
	
	//인스턴스를 공유하기 위해서 static 변수로 선언한다
	private static Singleton singleton = null;
	private int count = 0;
	
	//기본 생성자
	//private 이유: public 이면 외부에서 접근이 가능해서 생성자 호출을 차단한다
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void showCount() {
		count++;
		System.out.println("count:" + count);
	}

}
