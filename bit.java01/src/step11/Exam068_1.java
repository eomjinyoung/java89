/* 주제: 상속 - 다른 라이브러리 파일(.jar) 파일에 있는 클래스를 사용하기*/
package step11;

public class Exam068_1 {
  public static void main(String[] args) {
    ES_Calculator calc = new ES_Calculator();
    //3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);
  }
}

/*
# 다른 jar 파일에 있는 클래스 사용하기
=> 컴파일
   .jar 파일을 classpath에 추가해야 한다.
   예) javac -encoding utf8 -d bin -sourcepath src -cp "libs/es.jar" src/step11/Exam068_1.java
=> 실행
   .jar 파일을 classpath에 추가해야 한다.
   예)
   macOS    => java -cp "bin:libs/es.jar" step11.Exam068_1
   windows  => java -cp "bin;libs/es.jar" step11.Exam068_1









*/
