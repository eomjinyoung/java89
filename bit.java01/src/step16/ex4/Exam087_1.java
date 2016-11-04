/* 주제: 다른 클래스의 멤버에 접근하기
*/
package step16.ex4;

public class Exam087_1 {
  public static void main(String[] args) {
    Exam087_0 obj = new Exam087_0();
    //obj.v1 = 1000; // 컴파일 오류! private은 다른 클래스에서 접근할 수 없다.
    obj.v2 = 2000; // OK! (default) = 같은 패키지
    obj.v3 = 3000; // OK! protected = 같은 패키지 + 자손 클래스
    obj.v4 = 4000; // OK! public = ALL
  }
}