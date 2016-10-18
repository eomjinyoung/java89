// 주제: 연산자 - 연산자 우선순위
package step04;

public class Exam038_0 {
  public static void main(String[] args) {
    //1) +, - 보다 *, / 를 먼저 실행한다.
    int result = 10 + 5 * 2;
    System.out.println(result);

    //2) 같은 레벨에서는 먼저 있는 것을 먼저 실행한다.
    result = 10 / 5 * 2;
    System.out.println(result);

    //3) 괄호는 최상위 실행 권한을 갖는다.
    result = (10 + 5) * 2;
    System.out.println(result);
  }
}

/*












*/
