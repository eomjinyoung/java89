// 주제: 변수 선언 - 기본 타입을 묶어 새로운 타입을 정의하기 (II)
package step03;

public class Exam035 {
  // 인스턴스 변수로 데이터 타입 정의하기
  static class Score { // 4 종류의 메모리를 묶어 새 데이터 타입을 만든다.
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    //인스턴스 변수로 구성된 새 데이터 타입의 메모리를 만드는 방법
    Score s1 = new Score(); // 메모리 준비. 이 메모리의 이름은 s1
    Score s2 = new Score(); // 메모리 준비. 이 메모리의 이름은 s2

    // 메모리에 값 넣기
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = s2.sum / 3;

    System.out.println(s1.aver);
    System.out.println(s2.aver);

  }
}

/*
# 개발자가 임의의 새 데이터 타입을 저장하는 문법
class 새타입이름 {
  // 메모리 항목
  int kor;
  int eng;
  ...
}

# 인스턴스 변수로 구성된 데이터 타입은
  new 명령을 사용하여 메모리를 준비한다.
  [새데이터타입이름] [메모리를가리키는별명] = new 새데이터타입이름();

# class 문법의 용도
1) 개발자가 프로그램에서 사용할 임의의 데이터 타입을 정의할 때
   => 사용자 정의 데이터 타입(user defined data type) 만들 때
2) 관련된 메서드를 관리하기 쉽도록 묶을 때
   => 메서드를 분류할 때





*/
