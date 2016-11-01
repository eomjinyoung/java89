/* 주제: Class 클래스 - 클래스 이름 알아내기
*/
package step12;

public class Exam077_1 {
  // 클래스 안에 메서드나 변수와 동등 레벨로 선언된 경우, 멤버 inner 클래스라 한다.
  static class A {
    /*static Class class; <-- 모든 클래스는 무조건 이 변수를 내장하고 있다.*/
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }
  public static void main(String[] args) throws Exception {
    A obj = new A();
    Class clazz1 = obj.getClass();

    //1) 클래스 이름 리턴
    String classNameWithPackageName = clazz1.getName();
    String classNameOnly = clazz1.getSimpleName();

    System.out.println(classNameWithPackageName);
    System.out.println(classNameOnly);
    System.out.println(clazz1.toString());

    //2) member 클래스 또는 local 클래스
    System.out.println(clazz1.isMemberClass()); // 멤버 inner 클래스 여부
    System.out.println(clazz1.isLocalClass()); // 로컬 inner 클래스 여부

    // 메서드 안에 선언된 클래스를 로컬 inner 클래스라 한다.
    class B {}

    System.out.println(B.class.isMemberClass()); // inner 클래스 여부
    System.out.println(B.class.isLocalClass()); // 로컬 inner 클래스 여부
  }
}

/*














*/
