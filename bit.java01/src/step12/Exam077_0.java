/* 주제: Class 클래스 - 클래스 정보를 얻는 다양한 방법
*/
package step12;

public class Exam077_0 {
  static class A {
    /*static Class class; <-- 모든 클래스는 무조건 이 변수를 내장하고 있다.*/
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }
  public static void main(String[] args) throws Exception {
    //1) 인스턴스를 통해 얻기
    A obj = new A();
    Class clazz1 = obj.getClass();

    //2) "class"라는 내장 스태틱 변수를 통해서 얻기
    // => 모든 클래스는 자신의 로딩된 정보를 가리키는 static 변수 class를 갖고 있다.
    Class clazz2 = A.class;

    //3) Class의 forName() 메서드를 통해 얻기
    Class clazz3 = Class.forName("step12.Exam077_0$A");

    if (clazz1 == clazz2) System.out.println("clazz1 == clazz2");
    if (clazz1 == clazz3) System.out.println("clazz1 == clazz3");
  }
}

/*














*/
