/* 주제: Class 클래스 - 메서드 정보 추출하기
*/
package step12;

import java.lang.reflect.Method;

public class Exam077_3 {
  static class A {
    /*static Class class; <-- 모든 클래스는 무조건 이 변수를 내장하고 있다.*/
    String name;
    int age;

    public void m1() {System.out.println("Hello");}
    protected void m2() {}
    void m3() {}
    private void m4() {}
  }
  public static void main(String[] args) throws Exception {
    Class clazz = A.class;

    //1) 클래스의 메서드 목록을 얻는다.
    // => 그 클래스의 메서드 및 수퍼 클래스의 메서드를 추출한다.
    //    단 public 접근 범위를 갖는 메서드만 추출한다.
    Method[] methods = clazz.getMethods();

    //2) 반복문을 통해 메서드 이름을 알아낸다.
    for (Method method : methods) {
      System.out.println(method.getName());
    }
    System.out.println("---------------------------");

    //=> 수퍼 클래스의 메서드를 제외하는 대신
    //   그 클래스의 모든 접근 범위의 메서드를 추출한다.
    methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }

  }
}

/*














*/
