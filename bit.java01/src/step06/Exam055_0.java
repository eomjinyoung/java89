// 주제: 명령어 묶기 - 파라미터와 아규먼트의 정의

package step06;

public class Exam055_0 {
  static void square(int value) {
    value  *= value;
  }
  public static void main(String[] args) {
    int value = 3;
    square(value);
  }
}

/*
# 아규먼트
- 메서드를 호출할 때 넘겨주는 값이다.
예) square(30) or square(value)
    이때 30이나 value를 아규먼트라 부른다.

# 파라미터
- 메서드가 넘긴 값을 받는 로컬 변수이다.
예) void square(int value) {...}
    이때 value 변수가 파라미터이다.










*/
