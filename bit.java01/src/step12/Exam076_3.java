/* 주제: Object 클래스 - 기본 메서드 getClass()
=> 원래 동작(Object의 메서드를 그대로 사용할 때)
  클래스 정보를 갖고 있는 인스턴스를 리턴한다.
  이 메서드는 오버라이딩하지 않는다.
*/
package step12;

public class Exam076_3 {
  static class A {
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A();

    //1) 인스턴스가 어떤 클래스를 참조하여 만들었는지
    //   그 로딩된 클래스 정보(를 저장한 인스턴스의 주소)를 리턴한다.
    Class ref1 = obj1.getClass();
    Class ref2 = obj2.getClass();

    //2) 클래스 로딩은 오직 한 번만 이루어지기 때문에
    //   클래스 정보는 각 클래스 별 한 개만 존재한다.
    if (ref1 == ref2) System.out.println("ref1 == ref2");

    //3) 클래스 정보에서 클래스 이름을 뽑아내보자!
    System.out.println(ref1.getName());
  }
}

/*





*/
