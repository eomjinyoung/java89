// 주제: 명령어 흐름 제어 - if ~ else ~ 문
// => 블록 사용 후

package step05;

public class Exam046_3 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 19)
      System.out.println("청소년입니다.");
    else
      System.out.println("성인입니다.");

  }
}

/*
# if ~ else
- if 조건이 참이면 해당 블록을 실행한다.
  조건이 거짓이면 바로 else 블록을 실행한다.
- else 문은 독립적으로 사용할 수 없다.
  반드시 if 문 뒤에 사용해야 한다.






*/
