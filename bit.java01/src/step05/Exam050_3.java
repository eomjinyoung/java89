// 주제: 명령어 흐름 제어 - 반복문 for에 여러 초기화 변수 선언하기

package step05;

public class Exam050_3 {
  public static void main(String[] args) {
    for (int i = 0, j = 10; i < 3; i++, j--)
      System.out.printf("%d:%d\n", i, j);
  }
}

/*
#




*/
