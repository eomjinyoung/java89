// 주제: 명령어 흐름 제어 - 클래스 블록과 변수 선언

package step05;

public class Exam045_3 {
  static int a = 20;
  public static void main(String[] args) {
    a = 100; // OK!
    int b = 10;
  }

  static void m1() {
    a = 200; // OK!
    //b = 200; // 컴파일 오류! 다른 메서드 블록에 선언된 변수는 접근할 수 없다.
  }
}

/*
# 클래스 블록에 선언된 변수
=> 모든 메서드 블록에서 사용할 수 있다.







*/
