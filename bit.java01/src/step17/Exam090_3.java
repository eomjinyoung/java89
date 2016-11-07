/* 주제: 컬렉션 클래스 HashSet - 데이터 중복의 기준
=> HashSet은 값을 저장할 때  
   인스턴스의 hashCode()가 리턴한 값을 가지고 그 위치를 결정한다.
   따라서 해시 값이 같으면 같은 위치에 저장한다.
=> 데이터 중복의 기준은? 
   - hashCode()의 리턴값이다. equals()의 리턴값이다.
   - String 클래스는 같은 문자열에 대해 같은 해시 값을 리턴하도록
     hashCode() 메서드를 재정의하였다.
     그래서 String은 인스턴스가 다르더라도 문자열이 같으면
     같은 해시값을 리턴하도록 프로그램 했기 때문에,
     같은 문자열이 중복저장되지 않는다.
   - Customer 클래스는 hashCode()를 재정의하지 않았다.
     즉 인스턴스에 저장된 값에 상관없이 무조건 다른 해시값을 리턴한다.
     그래서 Customer 클래스는 인스턴스에 같은 값이 있더라도, 
     해시값이 다르기 때문에 중복 저장될 수 있다.
   
*/
package step17;

import java.util.*;

public class Exam090_3 {
  public static void main(String[] args) {
    //HashSet<String> set = new HashSet<String>();
    // 변수 선언과 함께 인스턴스를 생성할 때는
    // 변수 선언부에 제네릭 정보가 있기 때문에
    // 인스턴스 생성하는 명령어에는 타입을 생략할 수 있다. 
    HashSet<String> set = new HashSet<>();
    set.add(new String("홍길동"));
    set.add(new String("홍길동"));
    set.add(new String("홍길동"));
    for (String name : set) {
      System.out.println(name);
    }
    System.out.println("-------------------------");
    
    HashSet<Customer> set2 = new HashSet<>();
    set2.add(new Customer("홍길동", 20, false));
    set2.add(new Customer("홍길동", 20, false));
    set2.add(new Customer("홍길동", 20, false));
    for (Customer customer : set2) {
      System.out.println(customer);
    }
    
  }
}