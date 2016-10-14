// 주제: 서식 문자열을 출력하는 방법
package step01;

public class Exam018 {
  public static void main(String[] args) {
    String name = "홍길동";
    int age = 20;

    // 서식이 없는 문자열 출력
    System.out.println("이름: " + name + ", 나이: " + age);

    // 서식이 있는 문자열 출력
    System.out.printf("이름: %s, 나이: %d\n", name, age);
  }
}

/*
=> printf(서식문자열, 값, 값)
서식 문자열: %d, %s 등의 특수 명령을 사용하여 삽입할 값의 조건을 지정한다.
값: %d, %s 등으로 지정된 곳에 삽입될 값이다. 값을 담은 변수를 지정할 수 있다.









*/
