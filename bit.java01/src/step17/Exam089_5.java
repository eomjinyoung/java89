/* 주제: 컬렉션 클래스 - ArrayList와 데이터 중복 방지!
=> 값을 입력하기 전에 값의 존재 여부를 확인한다.
*/
package step17;

import java.util.*;

public class Exam089_5 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    
    String name = "홍길동";
    if (!list.contains(name))
      list.add(name);

    if (!list.contains(name))
      list.add(name);
    
    if (!list.contains(name))
      list.add(name);

    for (Object ref : list) {
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }

  }
}