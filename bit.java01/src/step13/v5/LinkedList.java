package step13.v5;

// LinkedList가 다룰 데이터를 특정 이름으로 정의해 두고
// 그 정의된 이름을 사용하여 데이터 타입을 지정한다.
// => 즉 타입을 변수로 다루는 기술을 "Generic"이라 한다.
//    "type을 파라미터로 다룬다"라고도 표현한다.
public class LinkedList<T> {
  Box<T> head;
  Box<T> tail;
  int length;

  public LinkedList() {
    head = new Box<T>();
    tail = head;
  }

  public void add(T value) {
    tail.value = value;
    tail.next = new Box<T>();
    tail = tail.next;
    length++;
  }

  public T get(int index) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }

    Box<T> cursor = head;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public T set(int index, T newValue) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }

    Box<T> cursor = head;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    T oldValue = cursor.value;
    cursor.value = newValue;
    return oldValue;
  }

  public T remove(int index) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }

    T oldValue = null;
    if (index == 0) {
      oldValue = head.value;
      head = head.next;
    } else {
      Box<T> cursor = head;
      for (int i = 0; i < (index - 1); i++) {
        cursor = cursor.next;
      }
      oldValue = cursor.next.value;
      cursor.next = cursor.next.next;
    }
    length--;
    return oldValue;
  }

  public int size() {
    return length;
  }



  // 특정 클래스에서만 사용하는 클래스라면
  // 굳이 바깥에 두지 말고 그 클래스 안에 둔다.
  // => 사용 범위를 좁히게 되면 관리가 쉬워진다.
  private class Box<T>  {
    T value;
    Box<T> next;

    public Box() {}

    public Box(T value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Box(" + this.value + ")";
    }
  }

}
