/* 주제: 컬렉션 클래스 HashMap - Key 클래스의 자격 요건을 갖춘 경우
=> key 객체의 값이 같으면, 
   hashCode()의 리턴 값이 같고, equals()의 리턴 결과가 true가 되도록 
   두 메서드를 재정의하였다.
*/
package step17;

import java.util.*;

public class Exam091_2 {

  static class MyKey {
    String value1;
    int value2;

    public MyKey(String value1, int value2) {
      this.value1 = value1;
      this.value2 = value2;
    }

    @Override 
    public int hashCode() {
      /*
      String value = String.format("%s,%d", this.value1, this.value2);
      return value.hashCode();
      */
      return String.format("%s,%d", this.value1, this.value2).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof MyKey)) return false;
      MyKey other = (MyKey)obj;
      if (!this.value1.equals(other.value1)) return false;
      if (this.value2 != other.value2) return false;
      return true;
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
    
    /* 다음 코드는 컴파일 오류이다.
       => for (:) 에 들어갈 값은 배열 또는 java.util.Iterable, java.util.Collection 이어야 한다.
    for (String value : map) {
      System.out.println(value);
    }
    */
  }
}