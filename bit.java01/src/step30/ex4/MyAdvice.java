package step30.ex4;

import org.aspectj.lang.JoinPoint;

public class MyAdvice {
  // 필터가 삽입되는 메서드의 호출 정보를 받고 싶다면 JoinPoint 객체를 파라미터로 선언하라! 
  public void m1(JoinPoint jp) {
    System.out.println("----------------------");
    
    // 호출되는 메서드의 파라미터 값을 알 수 있다.
    System.out.printf("a=%d, b=%d\n", jp.getArgs()[0], jp.getArgs()[1]);
    
    // 메서드의 아규먼트 값을 변경 가능? NO!
    jp.getArgs()[0] = (int)jp.getArgs()[0] * 100;
    jp.getArgs()[1] = (int)jp.getArgs()[1] * 100;
  }
  
  // 메서드가 값을 리턴한 후에 필터 쪽에서 그 리턴 값을 알아낼 수 있다.
  // 단, AOP 설정에서 리턴 값을 받을 파라미터 이름을 지정해야 한다.
  // 예) <aop:after-returning method="m2" pointcut-ref="calcPoint" returning="result"/>
  // 이렇게 설정해야지 스프링에서 필터 m2()를 호출할 때 리턴 값을 result라는 파라미터로 넘겨줄 것이다.
  public void m2(int result) {
    System.out.println("**********************");
    System.out.printf("return=%d\n", result);
  }
  
  public void m3() {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
  }
}
