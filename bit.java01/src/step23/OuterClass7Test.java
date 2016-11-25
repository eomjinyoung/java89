/* 주제: 로컬 클래스에서 로컬 변수에 접근하기 
 */
package step23;

public class OuterClass7Test {
  
  static interface Calc {
    public void print();
  }
  
  public static void main(String[] args) {
    Calc obj = createCalc(300);
    obj.print();
    
    Calc obj2 = createCalc(400);
    obj2.print();
    
  }
  
  public static Calc createCalc(int value) {
    class CalcSub implements Calc {
      public void print() {
        System.out.println(value);
      }
    }
    //value = 300; // 변수의 값을 한 번이라도 바꾸면 final을 자동으로 붙이지 않는다.
    return new CalcSub(); 
  }
  
  
}





