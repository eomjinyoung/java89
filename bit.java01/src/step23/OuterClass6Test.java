/* 주제: Inner 클래스의 객체 만들기 
 */
package step23;

public class OuterClass6Test {
 
  public static void main(String[] args) {
    // static 멤버는 클래스 이름으로 접근하여 바로 사용할 수 있다.
    OuterClass6.Bike b = new OuterClass6.Bike();
    
    // 하지만, Inner 클래스는 바깥 클래스의 인스턴스 없이 생성할 수 없다.
    // 왜? 바깥 클래스의 인스턴스 멤버이기 때문에.
    //OuterClass6.Car obj = new OuterClass6.Car(); // 컴파일 오류!
    
    OuterClass6 outer = new OuterClass6(); // 먼저 바깥 클래스의 인스턴스를 만든다.
    OuterClass6.Car obj; // 참조 변수는 바깥 클래스 이름을 앞에 지정하여 선언할 수 있다.
    obj = outer.new Car(); // 바깥 클래스의 인스턴스를 이용하여 Inner 클래스 객체를 만든다.
   
    
    
  }
  
}





