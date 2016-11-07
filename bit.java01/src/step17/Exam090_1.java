/* 주제: 컬렉션 클래스 HashSet - 인덱스를 사용하여 꺼내기
=> 순서는 유지하지 못한다.
=> toArray()를 통해 값을 보관한 배열을 얻을 수 있다.
   간접적으로 배열 인덱스를 이용하여 값을 꺼낼 수 있다.
   그러나 순서는 보장하지 않는다.
=> 순서를 보장하지 않는 이유? 
   - 저장하는 방법이 다르다.
   - 인스턴스가 리턴한 해시 값(hashCode()메서드의 리턴값)을 가지고 
     저장할 위치를 계산하기 때문이다.
*/
package step17;

import java.util.*;

public class Exam090_1 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();

    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("안중근");
    set.add("윤봉길");

    Object[] values = set.toArray();

    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }

  }
}