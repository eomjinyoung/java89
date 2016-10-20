// 주제: 명령어 흐름 제어 - 반복문 while

package step05;

public class Exam048_1 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 10) {
      System.out.printf("%d: 하하하\n", count);
      count++;
    }
    System.out.println("----------------------");
    count = 0;
    while (count < 10) {
      System.out.printf("%d: 하하하\n", count++);
    }
  }
}

/*
# while (조건)
- 조건으로 boolean 값만 올 수 있다.
- 정수, 부동소수점 등은 조건으로 올 수 없다.
- 문법
  while (조건) 문장;
  while (조건) {문장1; 문장2; ...}





*/
