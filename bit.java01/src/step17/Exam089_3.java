/* 주제: 컬렉션 클래스 - ArrayList와 제네릭
=> ArrayList는 제네릭을 지원한다.
=> 저장할 데이터의 타입을 지정하지 않으면, 모든 타입을 다룰 수 있다.
=> 제네릭 문법을 사용하여 저장할 데이터의 타입을 제한할 수 있다.
*/
package step17;

import java.util.*;

public class Exam089_3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    
    list.add("홍길동"); // OK!
    //list.add(10); // 컴파일 오류!
    //list.add(3.14f); // 컴파일 오류!
    //list.add(new Score("임꺽정", 100, 100, 100)); // 컴파일 오류!
    //list.add(new Customer()); // 컴파일 오류!

    for (Object ref : list) {
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }

  }
}