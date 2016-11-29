/* 의존 객체 관리 : 현대적인 방식
 *     
 */
package step25.ex2;

public class Test {

  public static void main(String[] args) {
    Car c = new Car("비트비트", 5, "비트자동차");
    
    Engine e1 = new Engine("비트엔진", 5000);
    Engine e2 = new Engine("EM드라이브엔진", 200000);
    
    // 엔진을 마음대로 교체할 수 있기 때문에 코드의 유연성이 커진다.
    c.setEngine(e1);
    c.run();
    
    // 이것이 의존 객체 주입의 이점이다.
    c.setEngine(e2);
    c.run();
  }

}
