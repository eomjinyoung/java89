/* 주제: 객체지향 핵심 문법 - 클래스 정리 : 정리1 예
=> 정리1:
   클래스는 사용자가 프로젝트의 조건에 맞는 데이터 타입과
   그 타입의 데이터를 다루는 연산자를 정의할 때 사용하는 문법이다.
=> 정리2:
   클래스는 서로 관련된 메서드를 유지보수하기 좋도록 묶어두는 문법이다.
*/

package step08;

public class Exam061_0 {

  // 학생의 정보를 다루기 위한 새 데이터 타입 정의
  // => 여러 타입의 메모리로 이루어진 복합 데이터이다.
  static class Student {
    // 인스턴스 변수
    // => Student 인스턴스를 준비할 때 만들 메모리 종류
    // => 일종의 메모리 설계도
    String name;
    String email;
    String tel;
    int age;
    boolean working;

    // 인스턴스 메서드:
    // => 인스턴스의 값을 다루는 모든 메서드는 그 데이터 타입의 "연산자"라 할 수 있다.
    // => 인스턴스 생성할 때 최초로 자동으로 호출되는 메서드를 "생성자"라 한다.
    Student(String name, String email, String tel, int age, boolean working) {
      this.name = name;
      this.email = email;
      this.tel = tel;
      this.age = age;
      this.working = working;
    }

    void printStudent() {
      System.out.printf("%s,%s,%s,%d,%b\n",
        this.name, this.email, this.tel, this.age, this.working);
    }
  }

  public static void main(String[] args) {
    Student[] arr = new Student[3];

    // 인스턴스를 생성할 때 값을 넘겨주면,
    // 그 값을 받을 수 있는 생성자를 찾아 호출한다.
    // 만약 그 값을 받을 수 있는 생성자를 못 찾으면 컴파일 오류가 발생한다!
    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2] = new Student("유관순", "yoo@test.com", "111-1113", 40, true);

    //생성자는 다음과 같이 나중에 따로 호출할 수 없다.
    //arr[0].Student("홍길동", "hong@test.com", "111-1111", 20, true); // 컴파일 오류!

    for (Student student : arr) {
      student.printStudent();
    }
  }


}

/*
# 생성자(constructor)
- 아주 특별한 메서드이다.
- 인스턴스를 생성할 때 반드시 호출해야 하는 메서드이다.
- 인스턴스를 생성할 때만 호출할 수 있는 메서드이다.
- 인스턴스를 생성한 후에는 따로 메서드를 호출할 수 없다.
- 생성자의 목적(존재 이유)
=> 메모리(인스턴스/객체)를 사용하기 전에 적절히 유효한 값으로 초기화시키는 것.
- 모든 클래스는 생성자를 한 개 이상 가져야 한다.
- 만약 생성자가 클래스에 없다면,
  컴파일러가 자동으로 기본 생성자를 만든다.
- 생성자가 있다면,
  컴파일러는 자동으로 기본 생성자를 만들어주지 않는다.
- 결론, 모든 클래스는 한 개 이상의 생성자가 반드시 있다.
- 생성자 문법: 메서드와 유사하다.
  => 클래스명(파라미터선언,...) {...}
  생성자는 리턴 타입이 없다.
  반드시 메서드 이름으로 클래스명을 사용해야 한다.
- "기본 생성자"란?
  파라미터가 없는 생성자를 기본 생성자라 한다.




*/
