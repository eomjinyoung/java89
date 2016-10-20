// 주제: 명령어 흐름 제어 - if 문

package step05;

public class Exam046_0 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    /*
    if (age)  //<--- 조건에 숫자를 넣을 수 없다.
      System.out.println("컴파일 오류!");
    */

    if (age < 19) System.out.println("미성년입니다.");
    if (age >= 19)
      System.out.println("성년입니다.");
  }
}

/*
# if 문
- 문법
  if (조건) 문장;
  if (조건) {
    문장1;
    문장2;
    ...
  }
- 조건이 참이면 주어진 문장을 수행한다.
- 조건의 값은 반드시 boolean 이어야 한다.







*/
