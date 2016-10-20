// 주제: 명령어 흐름 제어 - 반복문 for에서 초기화선언부 등 생략하기

package step05;

public class Exam050_2 {
  public static void main(String[] args) {
    int count = 0;
    for (; count < 3; count++)
      System.out.printf("%d: 하하하\n", count);
    System.out.println("-------------------------");

    count = 0;
    for (; count < 3;) {
      System.out.printf("%d: 하하하\n", count);
      count++;
    }
    System.out.println("-------------------------");
    count = 0;
    for (;;) { // 무한루프 for 문
      if (count >= 3)
        break;
      System.out.printf("%d: 하하하\n", count);
      count++;
    }
  }
}

/*
#




*/
