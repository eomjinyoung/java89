/* 주제: 컬렉션 클래스 HashMap - 데이터 저장과 꺼내기
=> 데이터 저장
   - (key, value) 한 쌍의 데이터를 저장한다.
=> key의 조건?
   - 같은 값을 갖는 인스턴스는
     hashCode()의 리턴 값이 같아야 한다.
     equals()의 리턴 값이 true 여야 한다.
=> 데이저 조회
   - key를 가지고 데이터를 찾는다.
=> HashMap vs. Hashtable
1) null 허용 여부
   - HashMap은 key 또는 value에 null을 넣을 수 있다.
   - Hashtable은 null 값을 key 또는 value에 넣을 수 없다.
2) 동기화 지원(한 번에 한 개의 스레드 만이 진입할 수 있는가 여부?)
   - HashMap은 동기화를 지원하지 않는다. 동시에 여러 스레드가 사용할 때
     값의 변경을 제어하지 않는다.
   - Hashtable은 동기화를 지원한다. 한 번에 한 스레드 만이 사용할 수 있다.
*/
package step17;

import java.util.*;

public class Exam091_0 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();

    // 값 저장
    // => key 객체의 해시값을 가지고 저장할 위치를 계산한다.
    // => key 객체에 저장된 값이 같다면 해시 값도 같아야 한다.
    //    hashCode()와 equals()를 재정의한 클래스만 사용하라!
    //    예) String, Wrapper 클래스(Byte, Short, Integer, Long, Float, Double, Character)
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    // 값을 조회할 때 사용할 키 객체 생성
    String key = new String("s003");

    // 키 객체를 사용하여 값 조회
    String value = map.get(key);

    System.out.println(value);
    

  }
}