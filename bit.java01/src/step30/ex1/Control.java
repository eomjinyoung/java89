package step30.ex1;

import java.util.Scanner;

public class Control {
  Scanner keyScan = new Scanner(System.in);
  
  public void testPlus() {
    System.out.print("a?");
    int a = Integer.parseInt(keyScan.nextLine());
    
    System.out.print("b?");
    int b = Integer.parseInt(keyScan.nextLine());
    
    Calculator calc = new Calculator();
    int result = calc.plus(a, b);
    System.out.printf("%d + %d = %d\n", a, b, result);
  }
}







