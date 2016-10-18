// 주제: 변수 선언 - 변수에 값 넣기
package step03;

public class Exam033_1 {
  public static void main(String[] args) {
    //1) 낱개로 변수를 선언하고 값 저장하기
    int kor;
    int eng;
    int math;
    kor = 100;
    eng = 100;
    math = 100;

    //2) 변수 선언과 값 저장을 합친 문법
    int age = 20;

    //3) 여러 개의 변수 선언과 값 저장을 합친 문법
    int k = 90, e = 90, m = 90;

    //그러나 다음과 같이 콤마(,)를 사용하여 여러 개의 변수 값을  저장할 수 없다.
    //kor = 90, eng = 90, math = 90; // 컴파일 오류!

    //다른 언어에서는 다음과 같은 방식으로 변수 선언 코드를 정리하기도 한다.
    int k2 = 90,
        e2 = 90,
        m2 = 90;
  }
}

/*







*/
