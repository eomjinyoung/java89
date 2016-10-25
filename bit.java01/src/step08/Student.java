// 주제: 객체지향 핵심 문법 - 생성자

package step08;

public class Student {
  // 인스턴스를 생성할 때 어떤 메모리를 만들어야 하는지에 대한 명령어이다.
  // => "인스턴스 변수(instance variables)"라고 부른다.
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  //생성자
  //=> 리턴 타입이 없어요, 메서드명이 클래스 이름과 같아요.
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

/*











*/
