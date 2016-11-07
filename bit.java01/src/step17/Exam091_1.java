/* 주제: 컬렉션 클래스 HashMap - Key 클래스의 자격 요건을 갖추지 않은 경우
=> key 객체의 값이 같더라도 
   hashCode()의 리턴 값이 다르고, equals()의 리턴 결과가 false이기 때문에
   같은 key로 간주되지 않는다. 
*/
package step17;

import java.util.*;

public class Exam091_1 {

  static class MyKey {
    String value1;
    int value2;

    public MyKey(String value1, int value2) {
      this.value1 = value1;
      this.value2 = value2;
    }
  }

  public static void main(String[] args) {
    HashMap<MyKey,String> map = new HashMap<>();

    MyKey key1 = new MyKey("오호라", 100);
    MyKey key2 = new MyKey("오호라", 100);

    System.out.printf("%d, %d, %b\n", 
      key1.hashCode(), key2.hashCode(), key1.equals(key2));

    map.put(key1, "홍길동");

    System.out.println(map.get(key1));
    System.out.println(map.get(key2));
    

  }
}