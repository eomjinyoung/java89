// 주제: 자바 패키지 != 폴더 (II)
public class Exam013 {
  public static void main(String[] args) {
    Exam012.greeting();
  }
}

/*
=> 소스 파일의 위치와 다른 곳에서 컴파일 할 때 주의할 사항!
[소스 파일이 있는 폴더에서 컴파일 할 때]
java01/src/step01> javac -encoding utf8 -d ../../bin/step01 Exam013.java
- 컴파일러는 Exam013.java를 컴파일 하면서 이 클래스가 사용하는 Exam012.java를
  현재 위치에서 찾는다. => 컴파일 성공!

[소스 파일과 다른 위치의 폴더에서 컴파일 할 때]
java01> javac -encoding utf8 -d bin/step01 src/step01/Exam013.java
- 컴파일러는 Exam013.java를 컴파일 하면서 이 클래스가 사용하는 Exam012.java를
  현재 위치에서 찾는다. => 컴파일 오류!
  이유? 현재 위치가 java01이기 때문이다.
- 해결책?
  Exam013.java가 사용하는 다른 클래스의 소스 파일 위치를 알려주면 된다.
java01> javac -encoding utf8 -d bin/step01 -sourcepath src/step01 src/step01/Exam013.java 




*/
