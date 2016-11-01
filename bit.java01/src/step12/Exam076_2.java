/* 주제: Object 클래스 - 기본 메서드 equals()
=> 원래 동작(Object의 메서드를 그대로 사용할 때)
  인스턴스가 다르면 false를 리턴한다.
=> 만약에 재정의 한다면 그 이유는?
  같은 값을 갖는 인스턴스에 대해 같은 것으로 취급하기 위해.
*/
package step12;

public class Exam076_2 {
  static class A {
    String name;
    int age;
  }
  static class B {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof B)) return false;
      B other = (B)obj;
      if (this.age != other.age) return false;
      if (!this.name.equals(other.name)) return false;
      return true;
    }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    obj1.name = "홍길동";
    obj1.age= 20;

    A obj2 = new A();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1.equals(obj2));
    System.out.println("------------------------");

    B obj3 = new B();
    obj3.name = "홍길동";
    obj3.age= 20;

    B obj4 = new B();
    obj4.name = "홍길동";
    obj4.age = 20;

    System.out.println(obj3.equals(obj4));
    System.out.println("------------------------");

  }
}

/*





*/
