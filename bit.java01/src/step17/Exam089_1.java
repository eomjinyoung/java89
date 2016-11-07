/* 주제: 컬렉션 클래스 - ArrayList 저장하고 꺼내기
=> 배열처럼 인덱스를 사용하여 데이터 목록을 다룰 수 있다.
*/
package step17;

import java.util.*;

public class Exam089_1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    
    // 1) 목록에 추가하기
    // => ArrayList는 인스턴스만 저장할 수 있다.
    // => primitive type? auto-boxing
    list.add("홍길동");
    list.add(10); // new Integer(10) => 오토박싱
    list.add(3.14f); // new Float(3.14f) => 오토박싱
    list.add(new Score("임꺽정", 100, 100, 100));
    list.add(new Customer()); 

    // 2) 목록에서 값을 꺼내기(by index)
    for (int i = 0; i < list.size(); i++) {
      Object ref = list.get(i);
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }

  }
}