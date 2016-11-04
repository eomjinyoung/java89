/* 주제: 클래스의 접근 제어 테스트
패키지 멤버만 접근을 허용하는 Exam086_1 과  
public 접근을 허용하는 Exam086_2 의 접근을 테스트해본다.
*/
package step16.ex3;

import step16.ex3.*;

public class Test {
  public static void main(String[] args) {
    Exam086_1 obj1; // 같은 패키지의 클래스는 접근할 수 있다.
    Exam086_2 obj2;
  }
}



