/* 주제: HashMap에서 값 꺼내기 - Entry 객체를 이용하여 key, value 모두 꺼내기 
=> 
*/
package step17;

import java.util.*;
import java.util.Map.Entry;

public class Exam092_0 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    //1) key와 value를 한쌍으로하는 값을 꺼내자
    // => Set 바구니에서 (key,value)를 가지고 있는 Entry 객체가 들어있다.
    Set<Entry<String,String>> set = map.entrySet();
    
    for (Entry<String,String> entry : set) {
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }
  }
}