// 주제: 연산자 - 논리 연산자 (&, |)
package step04;

public class Exam040_1 {
  public static void main(String[] args) {
    //AND 연산
    System.out.println(true & true);
    System.out.println(true & false);
    System.out.println(false & true);
    System.out.println(false & false);
    System.out.println("----------------------");

    //OR 연산
    System.out.println(true | true);
    System.out.println(true | false);
    System.out.println(false | true);
    System.out.println(false | false);
    System.out.println("---------------------");

    // && 와 &의 차이
    boolean a = false;
    boolean b = true;
    boolean c = a && (b = false); // 앞의 값에 따라 뒤의 명령을 계속 수행할 지 결정한다.
                                  // 만약 앞의 값이 false이면 이미 결론이 false이기 때문에
                                  // 다음 명령을 수행하지 않는다.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

    a = false;
    b = true;
    c = a & (b = false); // 앞의 값과 상관없이 무조건 끝까지 모든 명령을 실행한다.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

    // ||와 |의 차이
    a = true;
    b = true;
    c = a || (b = false); // && 연산자와 같은 원리
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

    a = true;
    b = true;
    c = a | (b = false); // | 연산자와 같은 원리
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);
  }
}

/*












*/
