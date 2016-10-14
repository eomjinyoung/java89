// 주제: 다른 클래스에 있는 메서드 실행하기
public class Exam009 {
  public static void main(String[] args) {
    Exam008.m1("홍길동");
    //Exam008.m2("오호라"); // 접근 컴파일 오류!
  }
}

/*
=> 다른 클래스의 메서드 실행하기
  - class_name.method_name(argument, ...);
=> 다른 클래스에 private으로 선언된 멤버는 접근할 수 없다.
  멤버? 클래스 블록 안에 선언된 메서드나 변수를 말한다.







*/
