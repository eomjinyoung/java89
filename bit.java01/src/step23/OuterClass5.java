/* 주제: 메서드 파라미터와 익명 클래스 
 */
package step23;

public class OuterClass5 {
 
  static public void start(Car car) {
    car.run();
  }
  
  public static void main(String[] args) {
    Car c1 = new Car("티코") {
      public void run() {
        System.out.println(this.model + ":우헤헤.. 달린다..");
      }
    };
    start(c1);
    
    start(new Car("그랜저") {
      public void run() {
        System.out.println(this.model + ": 달린다....");
      }
    });
    
  }
  
}





