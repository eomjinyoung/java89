/* 주제: 랩퍼(wrapper) 클래스 - 상수와 랩퍼 클래스
*/
package step12;

public class Exam079_1 {
  public static void main(String[] args) throws Exception {
    Integer i1 = 20; // 상수풀에 Integer 클래스의 인스턴스가 자동 생성된다.
    Integer i2 = 20; // 같은 값의 인스턴스가 있다면 기존의 주소를 리턴한다.

    if (i1 == i2) System.out.println("i1 == i2");
    if (i1.equals(i2)) System.out.println("i1과 i2는 내용이 같다.");
  }
}

/*














*/
