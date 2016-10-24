// 주제: 인스턴스와 레퍼런스 - String

package step07;

public class Exam056_0 {
  public static void main(String[] args) {
    //1) 문자열 저장하기
    String s1; // <-- 문자열이 저장된 메모리의 주소를 저장할 변수. 레퍼런스
    s1 = new String("홍길동"); // <-- 문자 3 개를 저장할 char 배열을 만들고
                               // 그 배열에 문자 코드를 저장한다.
                               // 또한 length 메모리에 문자 개수를 저장한다.
                               // 그리고 이 메모리의 주소를 리턴한다.
                               // s1에 문자열이 저장된 메모리의 주소가 들어있다.
                               // 주소를 알고 싶어요? 답: 자바는 알려주지 않는다.
    System.out.println(s1); // println()에 문자열이 저장된 메모리 주소를 전달한다.
                            // println()은 그 주소로 찾아가서 문자열을 꺼내 출력한다.
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
