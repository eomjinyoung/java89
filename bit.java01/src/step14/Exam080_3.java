/* 주제: 예외 처리 - throw로 던질 수 있는 객체
=> java.lang.Throwable 객체를 던질 수 있다.
=> 예외의 종류
1) Error
   -> 시스템 예외 객체라고 부른다.
   -> 애플리케이션이 던지는 것이 아니라 JVM에서 던지는 객체이다.
   -> 개발자가 사용하지 않는다.
   -> 메서드 선언부에 Error를 던진다고 선언할 필요는 없다. 선택사항이다.
   -> 메서드를 사용하는 개발자에게 예외 처리를 강요하지 않는다.
      예외 처리를 할 지 말 지는 개발자의 선택이다.
2) Exception
   -> 애플리케이션 예외 객체라고 부른다.
   -> 애플리케이션에서 던진다.
   -> 개발자가 특정 예외 상황에 대해 던질 때 사용하는 클래스이다.
   -> 메서드 선언부에 반드시 어떤 예외 객체를 던지는 지 선언해야 한다. 필수!
      문법) 리턴타입 메서드명(...) throws 예외클래스명, 예외클래스명, ... {...}
      예) void test(int a, int b) throws FileNotFoundException, ProtocolException {...}  
   -> 메서드를 사용하려는 개발자에게 예외 처리를 강제하는 효과가 있다.

*/
package step14;

import java.util.Scanner;

public class Exam080_3 {
  static int m1(int a, int b) {
    if (b == 0) {
      throw new Error("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }

  static int m2(int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }

  static int m3(int a, int b) {
    if (b == 0) {
      // throw 는 반드시 java.lang.Throwable 객체만 던질 수 있다.
      // 당연히 Throwable 서브 클래스도 포함하는 것이다.
      //throw new String("0으로 나눌 수 없습니다."); // 컴파일 오류!
    }
    return a / b;
  }
  
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();

    try { // try 블록 안에는 원래 하려했던 작업 코드를 작성한다.
      int result = m1(v1, v2);
      System.out.println(result);

    } catch (Error e) { // catch 블록 안에는 예외 상황을 처리하는 코드를 작성한다.
      System.out.println(e.getMessage()); // e 객체에 들어 있는 예외 내용을 출력한다.

    } finally { // 정상적으로 수행하든, 예외가 발생하든 상관없이
                // 무조건 실행되어야 하는 코드를 작성한다.
      System.out.println("안녕히 가세요!");
    }
  }
}

/*














*/
