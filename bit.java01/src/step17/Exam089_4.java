/* 주제: 컬렉션 클래스 - ArrayList와 데이터 중복
=> ArrayList는 데이터 중복을 허용한다.
*/
package step17;

import java.util.*;

public class Exam089_4 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    
    String name = "홍길동";
    list.add(name); 
    list.add(name);
    list.add(name);
    list.add(name);
    list.add(name);

    for (Object ref : list) {
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }

  }
}