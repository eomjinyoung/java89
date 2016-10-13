/* 주제: 주석
=> 자바 컴파일러가 무시하는 부분
=> 주석은 개발자 사이에 의사소통의 수단으로 사용한다.
=> 종류
   1) 한 줄 주석
   2) 여러 줄 주석
   3) 자바 API 문서를 만들 때 사용하는 주석(javadoc 주석)
   4) 자바 컴파일러나 자바 인터프리터(JVM)에게 전달하는 명령(애노테이션)
*/
/* 1) 여러 줄 주석
 이 클래는 주석에 대한 설명을 위해
 작성 되었습니다.
 주석의 끝을 만날 때까지 계속 주석으로 간주한다.*/
class Exam001 {
  public static void main(String[] args) {
    // 한 줄 주석: 줄 끝까지 주석으로 간주한다.
    // 단순한 출력
    System.out.println("Hello");
  }
}

/*
1) 컴파일 할 때 소스 코드의 인코딩 지정하기
=> 문자코드표 = character set(문자집합) = 인코딩(encoding)
=> 소스 코드가 어떤 문자 코드표를 사용하는지 컴파일러에게 알려주지 않으면,
   컴파일러는  OS가 기본으로 사용하는 문자코드표일거라고 생각한다.
   windows OS => MS949
   mac OS => utf8(UTF-8)
=> javac -encoding utf8 Exam001.java

2) 컴파일한 결과를 별도의 폴더에 저장하기
=> 소스 파일과 클래스 파일을 같은 폴더에 두면 소스 파일을 관리하기 불편한다.
=> 보통 bin(binary or 저장소, 통 이라는 의미) 이라는 폴더에 둔다.
=> javac -encoding utf8 -d ../bin Exam001.java

3) 다른 폴더에 있는 클래스 파일 실행하기
=> JVM에게 클래스가 있는 폴더의 위치를 알려준다.
=> java -classpath ../bin Exam001
=> java -cp ../bin Exam001










*/
