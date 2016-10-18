// 주제: 연산자 - '+' 연산자의 특별한 용법
package step04;

public class Exam036_5 {
  public static void main(String[] args) {
    //1) 두 문자열을 연결할 때 사용할 수 있다.
    String s1 = "홍길동";
    String s2 = "입니다.";
    String s3 = s1 + s2;
    System.out.println(s3);

    //2) 문자열과 숫자의 + 연산은 순서에 상관없이 문자열 연결이다
    // 즉 숫자가 문자열로 변환한 다음 문자열과 결합한다.
    String v1 = "나이는 ";
    int age = 20;
    String v2 = "입니다.";
    String v3 = v1 + age + v2;
    System.out.println(v3);

    System.out.println("문자열" + 3.14f);
    System.out.println("문자열" + 3.14);
    System.out.println("문자열" + true);
    System.out.println("문자열" + '가');
  }
}

/*












*/
