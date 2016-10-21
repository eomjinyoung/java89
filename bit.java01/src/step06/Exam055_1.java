// 주제: 명령어 묶기 - call by value

package step06;

public class Exam055_1 {
  static void square(int value) {
    value  *= value;
    System.out.printf("square():%d\n", value);
  }
  public static void main(String[] args) {
    int value = 3;
    square(value); // call by value.
                   // value 변수를 넘기는 것이 아니라 value 변수에 들어 있는 값을
                   // 넘기기 때문이다.
                   // 따라서 square() 메서드에서는 main()의 value 변수에 접근할 수 없다.
    System.out.printf("main():%d\n", value);
  }
}

/*
# call by value
- 메서드를 호출할 때 넘겨주는 것이 일반 값인 경우.










*/
