// 주제: 사용자 정의 타입의 인스턴스 - 해당 클래스를 위한 메서드 추가

package step07;

public class Student2 {
  // 인스턴스를 생성할 때 어떤 메모리를 만들어야 하는지에 대한 명령어이다.
  // => "인스턴스 변수(instance variables)"라고 부른다.
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  // 조심! 메서드는 인스턴스 생성과 관련이 없다.
  // 메서드는 Method Area 영역에 놓인다.
  // => 클래스 이름으로 호출하는 메서드를 "클래스 메서드", "스태틱 메서드"라고 한다.
  static void init(Student2 student, String name, String email, String tel, int age, boolean working) {
    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;
  }

  static void printStudent(Student2 student) {
    System.out.printf("%s,%s,%s,%d,%b\n",
      student.name, student.email, student.tel, student.age, student.working);
  }
}

/*











*/
