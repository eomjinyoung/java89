package patterns.command.v1;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("계산식> ");
    String expr = keyScan.nextLine(); // ex) 4 * 3
    
    String[] values = expr.split(" ");
    int a = Integer.parseInt(values[0]);
    int b = Integer.parseInt(values[2]);
    String op = values[1];
    
    Calculator calc = new Calculator();
    int result = 0;
    switch (op) {
    case "+": 
      result = calc.plus(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    case "-":
      result = calc.minus(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    case "*":
      result = calc.multiple(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    case "/":
      result = calc.divide(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    default:
      System.out.println("지원하지 않는 연산자입니다.");
    }
    
    keyScan.close();
  }
}
