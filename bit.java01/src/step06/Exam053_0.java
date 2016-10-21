// 주제: 명령어 묶기 - 메서드 정의

package step06;

public class Exam053_0 {
  //1) 리턴값(X), 파라미터(X)
  static void m1() {}

  //2) 리턴값(X), 파라미터(O)
  static void m2(int a, String b, float[] f) {}

  //3) 리턴값(O), 파라미터(X)
  static int m3() {return 100;}

  //4) 리턴값(O), 파라미터(O)
  static int m4(int a, float b) {return (int)(a * b);}

  public static void main(String[] args) {

  }
}


/*
# 메서드 정의 문법
  [리턴타입] 메서드명(파라미터 선언, ...) {
    명령들...
  }
=> 리턴타입: 메서드를 실행한 후 그 작업 결과를 리턴할 때 그 결과의 데이터 종류
             예) void(결과 없음), int, long, String, int[], String[], ...
=> 메서드명: 메서드를 실행할 때 사용할 이름.
             예) 메서드명();
             예) int value = 메서드명();
=> 파라미터 선언: 메서드를 호출할 때 넘겨 준 값을 받는 변수
             예) 메서드명(int a, int b, String[] arr)












*/
