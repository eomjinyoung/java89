// 주제: 명령어 흐름 제어 - 블록 변수 응용 I

package step05;

public class Exam045_6 {
  static int a = 20;

  public static void main(String[] args) {
    a = 100; // 로컬 변수 중에 a라는 이름의 변수가 없다면 클래스에서 찾는다.
    m1();
  }

  static void m1() {
    System.out.println(Exam045_6.a); // a 변수의 소속을 명시해도 상관없다.
  }

}

/*






*/
