// 주제: 자바 패키지 사용법 (II)
public class Exam016 {
  public static void main(String[] args) {
    step01.Exam015.greeting();
  }
}

/*
=> 다른 패키지의 클래스를 사용할 때
[소스 파일]
패키지명을 모두 적어야한다.
예) step01.Exam015.greeting();

[컴파일]
java01> javac -encoding utf8 -d bin -sourcepath src src/Exam016.java
-encoding utf8 : 소스 파일이 어떤 문자 코드표를 사용하여 저장했는 지 알려준다.
-d bin  : 컴파일한 후 그 결과 파일(.class)을 어느 폴더에 둘 것인지 지정한다.
          만약 패키지에 소속된 클래스라면 bin 폴더 아래에 자동으로
          하위 폴더를 만들고 저장할 것이다.
-sourcepath src : Exam016.java를 컴파일할 때 이 클래스가 만약 다른 클래스를
                  사용했다면 그 사용한 클래스의 소스가 어느 폴더에 있는지
                  알려준다.
                  패키지에 소속된 클래스라 할지라도 그냥 상위 src 폴더만 지정하며 된다.
                  즉 소스 파일이 있는 정확한 폴더의 위치까지 지정할 필요가 없다.

[실행]
java01> java -cp bin Exam016
-cp bin  : Exam016.class 파일 또는 이 클래스가 사용하는 다른 클래스 파일이
          어느 폴더에 있는지 지정한다.
          단 클래스가 있는 폴더의 위치까지 지정하는 것이 아니라,
          패키지가 있는 위치를 지정하면 된다.

=> 메서드 앞에 붙이는 public, private 등
public : 완전 공개. 어떤 클래스에서도 접근 가능!
private : 비공개. 그 메서드를 정의한 클래스에서만 접근 가능!
(default) : 안 붙인다. 그 클래스와 같은 패키지에 소속된 클래스만이 접근 가능!
protected : 같은 패키지 + 다른 패키지라도 자손 클래스라면 가능

=> 클래스 앞에 붙이는 public
public : 완전 공개.
(default) : 안 붙인다. 같은 패키지에서만 접근 가능하다.









*/
