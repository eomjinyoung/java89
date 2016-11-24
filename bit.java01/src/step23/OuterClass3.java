/* 주제: 스태틱 중첩 클래스의 활용 II
 * => 상수 값을 계층 구조로 관리하고 싶을 때 사용한다.
 */
package step23;

//=> 스태틱 중첩 클래스 적용 후
public class OuterClass3 {
  /* 오픈마켓 시스템에서 사용할 상수 값을 정의한다고 가정하자! */
  // => 간혹 다음과 같이 객체처럼 사용하기 위해 클래스 이름을 소문자로 하는 경우가 있다. 
  // => 파일 경로처럼 여러 단계를 지정하면서 특정한 값을 가리킬 때 유용하다.
  //    예) c:\workspace\java01\src\step23\OuterClass3.java
  // => 스태틱 중첩 클래스 이름을 소문자로 정의하면,
  //    다음과 같이 파일 경로처럼 값을 이해하기 쉽게 가리킬 수 있다.
  ///   int v = OuterClass3.level.GUEST; // 뭐뭐점 뭐뭐점 뭐뭐점... 이런 식으로 
  //    "뭐뭐점 뭐뭐점 .... " 이런 식으로 객체의 특정 값을 가리키는 기술을 
  //    "OGNL(Object Graph Navigation Language)"이라 부른다.
  //    예) R.id.addbutton, 서울.서초구.기흥동.은화마을 
  
  // 회원 등급에 대한 상수 값
  static class level {
    public static final int GUEST = 0;
    public static final int MEMBER = 1;
    public static final int ADMIN = 2;
  }
  
  // 결제 유형 
  static class pay {
    public static final int CARD = 0;
    public static final int CASH = 1;
    public static final int POINT = 2;
  }
  
  // 배달 유형
  static class delivery {
    public static final int BOX = 0;
    public static final int POST = 1;
    public static final int QUICK = 2;
  }
}





