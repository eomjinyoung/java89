/* 주제: HashMap에서 값 꺼내기 - Key 목록을 먼저 꺼낸 후 Value 알아내기 
=> 
*/
package step17;

import java.util.*;
import java.util.Map.Entry;

public class Exam092_1 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    // Key 목록 알아내기
    Set<String> keyList = map.keySet();

    // Key를 이용하여 value를 꺼내기
    for (String key : keyList) {
      System.out.printf("%s=%s\n", key, map.get(key));
    }
  }
}