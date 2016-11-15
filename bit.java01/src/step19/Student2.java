/* 내용: 직렬화를 허락하는 문법을 추가한다.
java.io.Serializable
- 인터페이스이다.
- 클래스의 인스턴스 값을 자동으로 직렬화하여 출력하는 것을 허락하는 용도로 사용한다.
- 이 인터페이스에는 메서드가 없다.
  왜? 단지 클래스가 직렬화할 수 있는가 여부를 지정하는 용도로 사용하기 때문이다.
- 이 인터페이서는 무엇을 위한 규칙인가?
  이 클래스의 인스턴스를 직렬화해도 된다는 것을 JVM에게 알리기 위해 사용한다.
*/
package step19;

public class Student2 implements java.io.Serializable {
  String name;
  int age;
  boolean working;

  public Student2() {}

  public Student2(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }

  @Override
  public String toString() {
    return String.format("%s,%d,%b", this.name, this.age, this.working);
  }
}