// 주제: 연산자 - 전위(pre)/후위(post) 연산자
package step04;

public class Exam037_0 {
  public static void main(String[] args) {
    //1) 전위 연산자 사용전
    int a = 10;
    a = a + 1;
    System.out.println(a);

    //2) 전위 연산자 사용후
    int b = 10;
    ++b;
    System.out.println(b);

    int c = 10;
    System.out.println(++c);

    a = 10;
    --a;
    System.out.println(a);

    b = 10;
    System.out.println(--b);
  }
}

/*












*/
