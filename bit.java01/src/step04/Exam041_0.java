// 주제: 연산자 - 조건 연산자
package step04;

public class Exam041_0 {
  public static void main(String[] args) {
    int age = 10;
    // (조건) ? A : B;
    // => A와 B는 결과를 리턴하는 명령어 이어야 한다. "expression(표현식)"
    // => 조건이 참이면 A를 실행하고, 거짓이면 B를 실행한다.

    // 컴파일 오류! A와 B자리에 그냥 statement가 왔다. expression 이 아니다.
    // 결과가 없다? 그 명령을 실행한 후 그 자리에 값이 놓이지 않는다는 의미.
    //(age < 19) ? System.out.println("미성년") : System.out.println("성년");

    // 조건 연산자는 반드시 그 값을 받아야 한다.
    // (age < 19) ? "미성년" : "성년"; // 컴파일 오류!

    String result = (age < 19) ? "미성년" : "성년"; // OK!
    System.out.println(result);
    
  }
}

/*
# statement(문장)
- 프로그램 언어로 작성하는 명령어

# expression(표현식)
- statement 중에서 결과를 리턴하는 statement











*/
