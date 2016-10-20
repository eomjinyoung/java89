// 주제: 명령어 흐름 제어 - if ~ else ~ 문 중첩 사용 IIII

package step05;

public class Exam046_7 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    // if ~ else if ~ else if ~ else와 블록의 사용
    if (age < 8) {
      System.out.println("유아입니다.");
    } else if (age >= 8 && age < 14) {
      System.out.println("어린이입니다.");
    } else if (age >= 14 && age < 19) {
      System.out.println("청소년입니다.");
    } else if (age >= 19 && age < 40) {
      System.out.println("청년입니다.");
    } else if (age >= 40 && age < 60) {
      System.out.println("중년입니다.");
    } else {
      System.out.println("노인입니다.");
    }


  }
}

/*
# 자바는 if ~ else if ~ else if ~ else 로 사용할 수 있다.
  단 else if 문법이 존재하는 것이 아니라,
  if ~ else 를 중첩해서 사용하는 것이다.
  단 소스 코드의 이해를 높이기 위해 마치 else if 가 있는 것처럼 정렬해서 사용한다.







*/
