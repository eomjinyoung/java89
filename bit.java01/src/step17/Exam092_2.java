/* 주제: HashMap에서 값 꺼내기 - Value 목록 알아내기 
=> 
*/
package step17;

import java.util.*;
import java.util.Map.Entry;

public class Exam092_2 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    // value 목록 알아내기
    Collection<String> valueList = map.values();

    // 목록에서 value를 꺼내기
    for (String value : valueList) {
      System.out.printf("%s\n", value);
    }
  }
}