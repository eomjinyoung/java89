// 주제: 명령어 흐름 제어 - 클래스 블록과 변수 선언 II

package step05;

public class Exam045_4 {
  static int a = 20;
  
  public static void main(String[] args) {
    int a = 200; // 클래스 블록에 선언된 변수는 같은 이름으로 메서드 안에 변수를 선언할 수 있다.
    System.out.println(a); // 가장 가까운 블록의 변수이다.

    // 클래스 블록에 선언된 변수를 쓰려면?
    // => 클래스 이름을 명시하라!
    System.out.println(Exam045_4.a);
  }

  static void m1() {
    int a = 300;
  }
}

/*
#







*/
