// 주제: 연산자 - 관계 연산자
package step04;

public class Exam039_0 {
  public static void main(String[] args) {
    boolean v = 10 == 20; // 관계 연산자의 결과는 논리 값이다.
    System.out.println(v); // false

    v = 10 != 20;
    System.out.println(v); // true

    v = 10 < 20;
    System.out.println(v); // true

    v = 10 <= 20;
    System.out.println(v); // true

    v = 10 > 20;
    System.out.println(v); // false

    v = 10 >= 20;
    System.out.println(v); // false

    System.out.println(3.14f > 3.12f);
    System.out.println(3.14 > 3.140000000001);
    System.out.println('가' > '각');
  }
}

/*












*/
