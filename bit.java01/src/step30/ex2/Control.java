package step30.ex2;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Control {
  
  @Autowired Calculator calc;
  
  Scanner keyScan = new Scanner(System.in);
  
  public void testPlus() {
    System.out.print("a?");
    int a = Integer.parseInt(keyScan.nextLine());
    
    System.out.print("b?");
    int b = Integer.parseInt(keyScan.nextLine());
    
    int result = calc.plus(a, b);
    System.out.printf("%d + %d = %d\n", a, b, result);
  }
}







