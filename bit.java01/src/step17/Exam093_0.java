/* 주제: HashMap과 Hashtable 차이점
=> null 허용 여부 : HashMap(OK), Hashtable(X)
=> 동기화 : HashMap(X), Hashtable(OK)
*/
package step17;

import java.util.*;

public class Exam093_0 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", null); // HashMap은 value에 null을 허용한다.
    map.put(null, "유관순"); // HashMap은 key에 null을 허용한다.
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");
    System.out.println(map.get("s002"));
    System.out.println(map.get(null));
    System.out.println("-----------------------------------");

    Hashtable<String,String> map2 = new Hashtable<>();
    map2.put("s001", "홍길동");
    //map2.put("s002", null); // 실행 오류! Hashtable은 value에 null을 허용하지 않는다.
    //map2.put(null, "유관순"); // 실행 오류! Hashtable은 key에 null을 허용하지 않는다.
    map2.put("s004", "안중근");
    map2.put("s005", "윤봉길");
    System.out.println(map2.get("s002"));
    //System.out.println(map2.get(null)); // 실행 오류! Hashtable은 key에 null을 허용하지 않는다.
  }
}