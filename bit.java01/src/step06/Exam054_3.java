// 주제: 명령어 묶기 - 임의 개수의 값을 받는 변수 응용 II
// => 배열을 사용할 때와 varargs를 사용할 때 비교

package step06;

public class Exam054_3 {
  static void score(int[] values, String name) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
  }


  //static void score2(int... values, String name) { // 컴파일 오류! 가변 개수 파라미터 뒤에 또 변수 선언이 왔다.
  static void score2(String name, int... values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
  }

  public static void main(String[] args) {
    score(new int[]{100,90,80}, "홍길동");
    //score2(100, 90, 80, "임꺽정");
    score2("임꺽정", 100, 90, 80);
    score2("유관순", 100, 90, 80, 10, 40);
  }
}

/*
# 가변 개수 아규먼트 사용 시 유의할 점
- 가변 개수 아규먼트는 뒤에 다른 변수를 선언할 수 없다.
  반드시 맨 마지막에 와야 한다.
- 가변 개수 아규먼트를 여러 개 선언할 수 없다.

# 배열 파라미터의 이점
- 배열 파라미터 다음에 다른 파라미터를 선언할 수 있다.
- 여러 개의 배열 파라미터를 선언할 수 있다.









*/
