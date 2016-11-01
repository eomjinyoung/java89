/* 주제: String 클래스 - 인스턴스를 Constants Pool에 생성하기
*/
package step12;

public class Exam078_3 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello"); // Heap 인스턴스 존재
    String s2 = s1.intern(); // 상수풀에 스트링 인스턴스 생성
                             // 이미 상수풀에 그 값을 갖는 스트링이 있다면,
                             // 기존 스트링의 인스턴스 주소를 리턴한다.
    String s3 = "Hello"; // 이미 위에서 상수풀에 "Hello" 스트링을 만들었다.
                         // 따라서 s3에는 이전에 생성된 인스턴스 주소가 리턴된다.

    if (s1 != s2) System.out.println("s1 != s2");
    if (s2 == s3) System.out.println("s2 == s3");

  }
}

/*














*/
