// 주제: parameter(매개변수)와 argument(인자)
public class Exam008 {
  public static void main(String[] args) {
    m1("홍길동"); // 메서드 실행할 때 값 넘기기
    m2("전봉준");
  }

  static void m1(String name) {
    System.out.print(name);
    System.out.print("님 안녕하세요.\n");
  }

  private static void m2(String name) {
    System.out.print("Hello, ");
    System.out.print(name + "\n");
  }
}

/*
=> parameter
  - 메서드들 실행할 때 넘겨 준 값을 받는 변수(그릇)
=> argument
  - 메서드를 실행할 때 넘겨 주는 값
=> 실무:
  - 개발자들이 둘을 구분하지 않고 혼용하여 막 쓴다.
  - 메서드를 실행한다는 것을 "메서드 호출(method call, method invoke)한다" 라고 표현한다.








*/
