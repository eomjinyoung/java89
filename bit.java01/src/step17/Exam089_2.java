/* 주제: 컬렉션 클래스 - ArrayList와 for(:) 문
=> for(변수선언 : 배열 또는 컬렉션 객체)
=> 컬렉션 객체란?
   java.util.Collection 계약에 따라 작성된 클래스를 말한다.
   예) ArrayList, LinkedList, Vector, HashSet, Stack, PriorityQueue 등 
*/
package step17;

import java.util.*;

public class Exam089_2 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    
    list.add("홍길동");
    list.add(10); // new Integer(10) => 오토박싱
    list.add(3.14f); // new Float(3.14f) => 오토박싱
    list.add(new Score("임꺽정", 100, 100, 100));
    list.add(new Customer()); 

    for (Object ref : list) {
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }

  }
}