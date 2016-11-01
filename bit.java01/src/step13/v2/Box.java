/* 값을 저장할 때 사용할 메모리를 정의한다.*/
package step13.v2;

public class Box  {
  int value;
  Box next;

  public Box() {}

  public Box(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Box(" + this.value + ")";
  }
}
