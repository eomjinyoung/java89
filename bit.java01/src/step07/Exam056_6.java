// 주제: 인스턴스와 레퍼런스 - 스트링 내용 비교

package step07;

public class Exam056_6 {
  public static void main(String[] args) {
    String s1 = new String("홍길동");
    String s2 = new String("홍길동");

    if (s1 == s2) { // == 은 레퍼런스 변수에 들어 있는 주소를 비교한다.
      System.out.println("s1과 s2가 같은 인스턴스이다. 즉 주소가 같다!");
    }

    // 스트링 인스턴스에 들어있는 값이 같은지 비교하고 싶다!
    // => 값이 같은지 비교할 때는 equals() 메서드를 사용하라!
    if (s1.equals(s2)) {
      System.out.println("s1 인스턴스에 저장된 값과 s2 인스턴스에 저장된 값이 같다.");
    }
  }
}

/*











*/
