/* 주제: 상속 - 다른 클래스의 기능을 확장하기*/
package step11;

public class Exam068_2 {
  public static void main(String[] args) {
    MyCalculator calc = new MyCalculator();
    //7 - 5 ** 4 % 3 = 1
    calc.plus(7);
    calc.minus(5);
    calc.power(4);
    calc.remainder(3);
    System.out.println(calc.result);
  }
}

/*
# 상속
- 기존 코드에 기능을 확장하는 문법
- 기존 코드를 변경하지 않기 때문에 변경에 따른 위험도가 낮아진다.
- 기존 코드를 쉽게 재사용할 수 있다. => 개발비 절감
- 기존의 소스 코드가 없어도 .class 파일만 있어도 상속 받을 수 있다.
- 상속이 없다면?
  같은 기능을 하는 코드를 매번 중복해 작성할 것이다.

# 상속 용어
예)
class A {}
class B extends A {}
- parents class / super class
  기능을 상속 해주는 클래스 => "A" 클래스
- child class / sub class
  부모 클래스를 참조하여 기능을 상속 받는 클래스 => "B" 클래스

# 상속의 방법
1) Specialization (기능 특화)
  - 기존 클래스를 확장하여 서브 클래스를 만드는 것
2) Generalization (기능 일반화)
  - 기존의 클래스들의 공통점을 모아서 수퍼 클래스를 만드는 것








*/
