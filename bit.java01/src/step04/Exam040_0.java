// 주제: 연산자 - 논리 연산자
package step04;

public class Exam040_0 {
  public static void main(String[] args) {
    // 논리 연산자(AND, OR)의 결과는 논리 값이다.
    //boolean v = 10 && 20; // 컴파일 오류! 피연산자는 논리 값이어야 한다.
    boolean v = true && true; // OK!
    System.out.println(v);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    System.out.println("----------------------");
    // OR 연산자
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
  }
}

/*












*/
