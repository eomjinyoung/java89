// 주제: 변수 선언 - 기본 타입을 묶어 새로운 타입을 정의하기 (I)
package step03;

public class Exam034 {
  // static 변수로 데이터 타입 정의하기
  static class Score { // 4 종류의 메모리를 묶어 새 데이터 타입을 만든다.
    static int kor;
    static int eng;
    static int math;
    static int sum;
    static float aver;
  }

  public static void main(String[] args) {
    //static 변수로 만든 데이터 타입은 바로 사용하면 된다.
    Score.kor = 100;
    Score.eng = 90;
    Score.math = 100;
    Score.sum = Score.kor + Score.eng + Score.math;
    Score.aver = Score.sum / 3;

    System.out.println(Score.aver);

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

# static 변수로 구성된 데이터 타입은
  여러 개의 메모리를 만들 수 없다.
=> 다음 int 데이터 타입은 4바이트 메모리를 여러 개 만들 수 있다.
int a;
int b;
int c;
=> 그러나 위에서 선언한 Score 타입은 오직 한 개만 존재한다.
   위의 int 처럼 변수를 선언할 필요도 없다.
   그냥 사용하면 된다.
Score s1; // 의미 없음
Score s2; // 의미 없음






*/
