/* 주제: 컬렉션 클래스 HashSet - 데이터 저장과 꺼내기
=> 데이터 저장
   - 인스턴스의 해시 값을 사용하여 데이터를 저장한다.
   - 데이터를 순서대로 저장하는 것이 아니라 해시 값을 참고하여 
     저장한다.
   - 따라서 데이터 개수가 많더라도 조회 속도는 일정하다.
   - Set(집합)의 특성상 중복된 값을 저장할 수 없다.
=> 데이저 조회
   - 인덱스를 사용하여 꺼낼 수 없다.
*/
package step17;

import java.util.*;

public class Exam090_0 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();

    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("안중근");
    set.add("윤봉길");

    for (String value : set) {
      System.out.println(value);
    }

  }
}