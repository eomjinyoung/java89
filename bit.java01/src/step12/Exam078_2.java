/* 주제: String 클래스 - 문자열의 비교
=> "==" 연산자는 레퍼런스의 값(인스턴스의 주소)을 비교하는 것이다.
=> 문자열을 비교하려면 equals() 메서드를 사용해야 한다.
=> 원래 equals() 메서드는 Object 클래스의 메서드로,
   인스턴스의 주소를 비교한다.
=> 그러나 String 클래스에서 이 메서드를 재정의 하였다.
   인스턴스에 들어있는 문자열이 같은지 비교하도록 변경하였다.
*/
package step12;

public class Exam078_2 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    //주소는 다르다.
    if (s1 != s2) System.out.println("s1 != s2");

    //값은 같다
    if (s1.equals(s2)) System.out.println("s1과 s2는 내용이 같다.");
  }
}

/*














*/
