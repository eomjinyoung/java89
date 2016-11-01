/* 주제: String 클래스 - Immutable(불변의) 객체와 Mutable(변경가능) 객체
=> String 인스턴스의 값은 한 번 생성되면 변경되지 않는다.
=> Wrapper 인스턴스도 immutable이다.
*/
package step12;

public class Exam078_4 {
  public static void main(String[] args) throws Exception {
    // Immutable 객체의 예
    String s1 = "Hello, world!";
    String s2 = s1.replace('o', 'x'); // 기존 스트링을 가지고 문자'o'를 문자'x'로 교체한
                                      // 새 스트링 인스턴스를 만든다.
    System.out.println(s1);
    System.out.println(s2);

    // Mutable 객체의 예
    StringBuffer buf1 = new StringBuffer("Hello, world");
    buf1.replace(2, 4, "xx"); // 2번 문자에서 4번 문자 전까지. 주의! 4번 문자까지가 아니다.
    System.out.println(buf1);
  }
}

/*














*/
