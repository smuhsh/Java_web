package springFw.ex02.dp04;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton = Singleton.getInstance();
		singleton.showCount();
		
		Singleton singleton1 = Singleton.getInstance();
		singleton1.showCount();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.showCount();

	}

}
