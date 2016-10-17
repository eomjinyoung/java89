// 주제: 변수 선언 - 데이터를 저장할 메모리를 준비시키는 명령어
package step03;

public class Exam032 {
  public static void main(String[] args) {
    //메모리를 준비시키는 문법
    //=> [값의종류] [메모리이름];
    int a;
    /* int : 4바이트 크기의 정수 값을 담을 메모리를 의미
       a : 메모리의 이름. 다른 말로 변수(Variable)라고 부른다.
     */

    //메모리에 값 저장하는 문법
    //=> [메모리명] = [값];
    //기호 '='은 할당/배정(assignment) 명령(operator; 연산자)이라고 한다.
    a = 100;

    //메모리의 값 사용
    System.out.println(a);


  }
}
