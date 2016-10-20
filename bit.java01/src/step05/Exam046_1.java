// 주제: 명령어 흐름 제어 - if 문 (여러 문장 실행)
// => 블록 사용 전

package step05;

public class Exam046_1 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 19)
      System.out.println("청소년입니다.");
      System.out.println("성인은 일반 카드를 사용하셔야 합니다.");
    if (age >= 19)
      System.out.println("성인입니다.");
      System.out.println("청소년 카드를 사용할 수 없습니다.");

  }
}

/*
# 자바는 들여쓰기로 명령어를 묶지 않는다.
  반드시 블록({})을 사용하여 묶어야 한다.







*/
