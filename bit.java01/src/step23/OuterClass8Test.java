/* 주제: Inner 클래스에서 Outer 클래스의 인스턴스 변수에 접근하기 
 */
package step23;

public class OuterClass8Test {
  int x = 100;
  int y = 900;
  
  class MyClass {
    int x = 200;
    public void m1() {
      int x = 300;
      System.out.println(x);
      System.out.println(this.x);
      System.out.println(MyClass.this.x);
      System.out.println(OuterClass8Test.this.x);
      System.out.println(y);
    }
  }
  
  public static void main(String[] args) {
    OuterClass8Test obj = new OuterClass8Test();
    MyClass obj2 = obj.new MyClass();
    obj2.m1();
    
  }
  
  
  
}





