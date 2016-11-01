/* 주제: 랩퍼(wrapper) 클래스 - boxing 과 파라미터
*/
package step12;

public class Exam079_3 {
  static void m1(Object value) {
    System.out.println(value);
  }
  static void m2(int value) {
    System.out.println(value);
  }
  public static void main(String[] args) throws Exception {
    m1(new Integer(100));
    m1(200); // 오토 박싱. = m1(new Integer(200));
    m2(300);
    Integer obj = new Integer(400);
    m2(obj); // 오토 언박싱. = m2(obj.intValue());
    //m2("500"); // 컴파일 오류! 주의! 스트링은 자동으로 숫자로 바뀌지 않는다.
  }
}

/*














*/
