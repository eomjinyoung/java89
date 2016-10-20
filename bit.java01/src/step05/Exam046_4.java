// 주제: 명령어 흐름 제어 - if ~ else ~ 문 중첩 사용
// => 블록 사용 후

package step05;

public class Exam046_4 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 8)
      System.out.println("유아입니다.");
    else {
      if (age >= 8 && age < 14)
        System.out.println("어린이입니다.");
      else {
        if (age >= 14 && age < 19)
          System.out.println("청소년입니다.");
        else {
          if (age >= 19 && age < 40)
            System.out.println("청년입니다.");
          else {
            if (age >= 40 && age < 60)
              System.out.println("중년입니다.");
            else
              System.out.println("노인입니다.");
          }
        }
      }
    }
  }
}

/*
# if ~ else의 중첩
- else 블록 안에 또 if ~ else를 중첩할 수 있다.







*/
