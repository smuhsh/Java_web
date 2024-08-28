package springFw.ex04.aop01;
/*
 * 작성자: 황석현
 * 작성일: 2024-08-28
 * 개요:	 joinpoint
 * 
 * */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

//POJO 일반클래스
public class PerformanceAspect {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		//소스코드를 고치지 않고 logging 하기 위함
		
		// 어떤 메서드가 실행되었는지 joinPoint 가 시그니처를 통해 가져옴
		// pointcut 정보를 가져와서 메서드가 넘어온것을 출력함
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		System.out.println("[log] Before :"+methodName + " time Check Start.");
		
		long startTime = System.nanoTime(); //pointcut이 실행되기 전 startTime 을 실행시킴
		
		Object result = null;
		
		//Aspect 를 할 때 예외처리 필수
		try {
			result = joinPoint.proceed(); //pointcut 실행
		} catch (Exception e) {
			System.out.println("[log] Exception"+methodName);
		} finally {
			System.out.println("[log] Finally"+methodName);
		}
		
		//proxy 기반이면 핵심코드를 실행시켜야됨
		result = joinPoint.proceed(); //poincut 실행
		
		long endTime = System.nanoTime(); //pointcut 코드가 실행되고 난 뒤 endTime 을 실행시킴
		System.out.println("[log] After :"+methodName + " time Check End.");
		System.out.println("[log] :"+methodName + (endTime-startTime)+"nano Second.");
		
		return result;
	} 
}
