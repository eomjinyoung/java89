// 주제: 명령어 흐름 제어 - 반복문 for

package step05;

public class Exam050_0 {
  public static void main(String[] args) {
    for (int count = 0; count < 5; count++)
      System.out.printf("%d: 하하하\n", count);
  }
}

/*
# for 반복문
- 인덱스를 가지고 반복할 때 자주 사용한다.
- 특히 배열을 다룰 때 사용한다.
- 문법
for (변수선언부; 조건; 값증가) 문장;
for (변수선언부; 조건; 값증가) {문장1; 문장2; ...};
- 실행 순서
1) 변수선언부 실행
2) 조건
3) 문장
4) 값증가
5) 2번으로 간다.




*/
