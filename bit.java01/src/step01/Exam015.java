// 주제: 자바 패키지 사용법
// 소스 파일에 패키지를 지정한다.
package step01;

public class Exam015 {
  public static void main(String[] args) {
    int value = Math.abs(-200);
    System.out.print(value + "\n");

    // 1970.1.1 00:00:00 부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    long millis = System.currentTimeMillis();
    System.out.print(millis + "\n");
  }

  // 다른 클래스가 사용할 수 있도록 메서드를 정의한다.
  static void greeting() {
    System.out.print("안녕하쥬~~~\n");
  }
}

/*
=> 소스 파일의 원활한 관리를 위해서 패키지에 소속된 클래스는
   패키지 이름에 해당하는 폴더 아래에 두어라!
[컴파일]
java01>  javac -encoding utf8 -d bin src/step01/Exam015.java
- 자바 컴파일러는 패키지에 소속된 클래스를 컴파일 할 때,
  자동으로 패키지에 해당하는 폴더를 만든다.
  그리고 그 폴더에 컴파일한 .class 파일을 둔다.

[실행]
- 패키지에 소속된 클래스를 실행하려면 반드시 클래스 이름 앞에 패키지명을 주어야 한다.
java01> java -cp bin/step01 Exam015    <== 실행 오류!
java01> java -cp bin step01.Exam015    <== OK!




*/
