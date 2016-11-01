/* 주제: 랩퍼(wrapper) 클래스 - 오토박싱(auto-boxing)과 오토언박싱(auto-unboxing)
*/
package step12;

public class Exam079_2 {
  public static void main(String[] args) throws Exception {
    //1) 오토 박싱
    int i1 = 10;
    Integer obj1 = i1; // primitive type --> new Integer(i1) : 오토박싱이라 부른다.
    System.out.println(obj1.toString());

    //2) 오토 언박싱
    Integer obj2 = new Integer(100);
    int i2 = obj2; // 인스턴스 ---> primitive type : 오토언박싱이라 부른다.
                   // = obj2.intValue() 메서드 호출한 것과 같다.
    System.out.println(i2);
  }
}

/*














*/
