// 주제: 변수 선언 - 다른 종류의 메모리를 여러 개 묶어서 준비하기
package step03;

public class Exam035 {
  // class 문법으로 메모리의 종류를 정의한다.
  // => 여러 종류의 메모리를 묶어 새 데이터 타입을 만든다.
  // => 배열은 오직 같은 종류의 메모리만 여러 개 준비할 수 있다.
  // => 클래스 문법을 사용하면 다른 종류의 메모리를 여러 개 준비할 수 있다.
  // => Score는 String(1), int(4), float(1)로 구성되는 메모리임을 정의하는 것이지
  //    메모리를 즉시 준비하는 것은 아니다.
  //    즉 Score는 메모리를 준비할 때 참고할 설계도이다.
  // => 지금 당장 이런 메모리를 준비하라는 뜻이 아니다.
  //    나중에 new 라는 명령이 들어오면 그 때 이런 메모리들을 준비하라는 것이다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    // 1) 인스턴스 준비 (클래스 설계도에 따라 메모리를 준비하는 것)
    // => 클래스에 정의된 대로 복합 메모리 준비하기
    // => 이렇게 준비한 복합 메모리를 "인스턴스(instance)"라 부른다.
    Score s1 = new Score();

    // 2) 복합 메모리에 값 넣기
    // 인스턴스이름.내부메모리의이름
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    // 3) 복합 메모리의 값 꺼내기
    System.out.println(s1.name);
    System.out.println(s1.kor);
    System.out.println(s1.eng);
    System.out.println(s1.math);
    System.out.println(s1.sum);
    System.out.println(s1.aver);


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
