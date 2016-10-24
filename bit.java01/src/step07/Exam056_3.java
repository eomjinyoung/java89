// 주제: 인스턴스와 레퍼런스 - new String()의 주소

package step07;

public class Exam056_3 {
  public static void main(String[] args) {
    String s1 = "홍길동"; // Heap에 새 인스턴스 생성?
    String s2 = "홍길동"; // Heap에 새 인스턴스 생성?
    String s3 = "홍길동"; // Heap에 새 인스턴스 생성?

    if (s1 == s2) { // 주소가 같은지 검사한다.
      System.out.println("s1 == s2");
    }

    if (s1 == s3) { // 주소가 같은지 검사한다.
      System.out.println("s1 == s3");
    }

    if (s2 == s3) { // 주소가 같은지 검사한다.
      System.out.println("s2 == s3");
    }
  }
}

/*
# 인스턴스
- new 명령을 통해 Heap 영역에 만든 메모리를 말한다.
예) new String("Hello");
- 실무에서 개발자들은 인스턴스를 객체(object)라고 자주 부른다.

# 레퍼런스
- 인스턴스 주소를 저장한 변수를 말한다.
예) String s;










*/
