// 주제: 명령어 묶기 - 메서드 의미 (메서드 사용 전)

package step06;

public class Exam052_0 {
  public static void main(String[] args) {
    int count = 6;
    int starCount = 0;
    while (--count > 0) {
      while (starCount++ < count) {
        System.out.print("*");
      }
      System.out.println();
      starCount = 0;
    }
  }
}


/*
# 메서드
- 특정 목적의 작업을 수행하는 명령어들을 별도로 묶어 놓은 것.
- 장점
  => 언제든 다시 그 명령을 실행할 수 있다.
  => 명령들을 관련성에 따라 분류해 놓음으로써 소스 코드의 유지보수가 쉬워진다.












*/
