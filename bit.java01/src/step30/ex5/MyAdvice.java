package step30.ex5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
  @Before("execution(* step30..Calculator.*(..))")
  public void m1(JoinPoint jp) {
    System.out.println("----------------------");
    System.out.printf("a=%d, b=%d\n", jp.getArgs()[0], jp.getArgs()[1]);
  }
  
  @AfterReturning(value="execution(* step30..Calculator.*(..))", returning="result")
  public void m2(int result) {
    System.out.println("**********************");
    System.out.printf("return=%d\n", result);
  }
  
  @After("execution(* step30..Calculator.*(..))")
  public void m3() {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
  }
}
