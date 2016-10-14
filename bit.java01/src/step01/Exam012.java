// 주제: 자바 패키지 != 폴더
public class Exam012 {
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
=> 소스 파일을 체계적으로 관리하기 위해 하위 폴더를 만들어 저장
=> 클래스 파일도 마찬가지로 같은 하위 폴더에 두는 것이 좋다.
[컴파일]
step01> javac -encoding utf8 -d ../../bin/step01 Exam012.java
[실행]
step01> java -cp ../../bin/step01 Exam012

=> 컴파일한 결과를 둘 폴더를 지정할 때 ../../ 이런 식으로 경로를 작성하는 것이
   버거롭다.
[컴파일]
java01> javac -encoding utf8 -d bin/step01 src/step01/Exam012.java
[실행]
java01> java -cp bin step01/Exam012    <== 이렇게는 실행할 수 없다.
java01> java -cp bin step01.Exam012    <== 이렇게도 실행할 수 없다.
java01> java bin/step01/Exam012    <== 이렇게도 실행할 수 없다.
java01> java bin.step01.Exam012    <== 이렇게도 실행할 수 없다.

java01> java -cp bin/step01 Exam012    <== 오직 클래스 이름만 줄 수 있다.










*/
