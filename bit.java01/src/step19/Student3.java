/* 내용: 직렬화를 버전을 추가한다.
- java.io.Serializable을 선언한 클래스는 직렬화를 통해 인스턴스의 데이터를 외부로 출력할 수 있다.
  이때 출력하는 데이터의 버전을 명시하면, 
  그 데이터를 읽는 쪽에서는 버전을 검사하여 맞지 않으면 로딩을 취소할 수 있다.
  버전을 명시하지 않으면, 읽는 쪽에서 버전에 따른 상세 제어가 불가능하다.
- 결론!
  데이터의 버전에 따라 읽는 쪽에서 상세하게 제어할 수 있도록 하려면,
  직렬화를 사용하여 출력하는 쪽에서는 버전을 명시해야 한다.
  만약 상세하게 제어하기 싫다면 클래스에 버전을 명시할 필요는 없다.
*/
package step19;

public class Student3 implements java.io.Serializable {
  private static final long serialVersionUID = 1L;
  
  String name;
  int age;
  boolean working;

  public Student3() {}

  public Student3(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }

  @Override
  public String toString() {
    return String.format("%s,%d,%b", this.name, this.age, this.working);
  }
}