// 주제: 명령어 흐름 제어 - 반복문 for와 초기화 변수의 사용 범위

package step05;

public class Exam050_1 {
  public static void main(String[] args) {
    for (int count = 0; count < 5; count++)
      System.out.printf("%d: 하하하\n", count);
    //System.out.println(count); // count 변수는 for 블록의 변수이다. 컴파일 오류!
  }
}

/*
#




*/
