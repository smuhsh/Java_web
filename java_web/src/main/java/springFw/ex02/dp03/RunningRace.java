package springFw.ex02.dp03;

//템플릿 메서드 디자인 패턴

public abstract class RunningRace {
	
	private void ready() {
		System.out.println("준비");
	}
	
	protected abstract void run(); //추상메서드
	
	private void finish() {
		System.out.println("결승선");
	}
	public void race() {
		ready();
		run();
		finish();
	}
	
}
