/* 주제: 스프링 IoC 사용 전
 * => 필요한 객체를 직접 만들 쓴다. 
 */
package step30.ex1;

import step30.ex2.Control;

public class Test01 {

  public static void main(String[] args) {
    Control c = new Control();
    
    System.out.println("---------------------------");
    c.testPlus();
    System.out.println("***************************");
    
  }

}
