/* 주제: 랩퍼(wrapper) 클래스 -
=> primitive type(원시타입; byte, short, int, long, float, double, boolean, char)
   의 값을 좀 더 다양하게 다룰 때 사용하는 클래스를 말한다.
=> primitive type에 대한 클래스라고 해서 wrapper 클래스라 부른다.
byte    --> java.lang.Byte
short   --> java.lang.Short
int     --> java.lang.Integer
long    --> java.lang.Long
float   --> java.lang.Float
double  --> java.lang.Double
boolean --> java.lang.Boolean
char    --> java.lang.Character
=> 랩퍼 클래스도 String 클래스와 마찬가지로 Immutable 객체이면서 equals()를 재정의하였다.
*/
package step12;

public class Exam079_0 {
  public static void main(String[] args) throws Exception {
    Integer i1 = new Integer(20);
    Integer i2 = new Integer(20);

    if (i1 != i2) System.out.println("i1 != i2");
    if (i1.equals(i2)) System.out.println("i1과 i2는 내용이 같다.");
  }
}

/*














*/
