package step30.ex4;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
  public int plus(int a, int b) {
    System.out.println("plus()");
    return a + b;
  }
  
  public int minus(int a, int b) {
    System.out.println("minus()");
    return a - b;
  }
}
