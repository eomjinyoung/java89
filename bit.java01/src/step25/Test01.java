package step25;

import java.util.ArrayList;

public class Test01 {
  public static void main(String[] args) throws Exception {
    
    m();
    System.out.println("---------------");
    m("홍길동", "임꺽정", "유관순");
    System.out.println("---------------");
    m(new String[]{"홍길동", "임꺽정", "유관순"});
    System.out.println("---------------");
    
  }
  
  static void m(String... names) {
    for (String name : names) {
      System.out.println(name);
    }
  }
}
