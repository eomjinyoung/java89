/* command 패턴 : 
 * => "메서드(함수)의 객체화" 
 * => 각각의 메서드를 클래스로 분리하여 정의한다.
 * => 이점
 *    메서드를 추가하고 싶을 때 별도의 클래스로 만든다.
 *    클래스로 만들게 되면 기존 코드에 영향을 끼치지 않는다.
 *    왜? 새로 클래스 파일이 추가되는 것이다.
 * => 단점
 *    클래스가 잘게 쪼개져서 파일 개수가 많아진다.
 */
package patterns.command.v2;

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
    
    
    PlusOp plus = new PlusOp();
    MinusOp minus = new MinusOp();
    MultipleOp multiple = new MultipleOp();
    DivideOp divide = new DivideOp();
    
    int result = 0;
    switch (op) {
    case "+": 
      result = plus.execute(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    case "-":
      result = minus.execute(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    case "*":
      result = multiple.execute(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    case "/":
      result = divide.execute(a, b);
      System.out.printf("%d %s %d = %d\n", a, op, b, result);
      break;
    default:
      System.out.println("지원하지 않는 연산자입니다.");
    }
    
    keyScan.close();
  }
}
