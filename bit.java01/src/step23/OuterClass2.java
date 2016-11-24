/* 주제: 스태틱 중첩 클래스의 활용
 * => 상수 값을 계층 구조로 관리하고 싶을 때 사용한다.
 */
package step23;

//=> 스태틱 중첩 클래스 적용 전
public class OuterClass2 {
  /* 오픈마켓 시스템에서 사용할 상수 값을 정의한다고 가정하자! */
  
  // 회원 등급에 대한 상수 값
  public static final int LEVEL_GUEST = 0;
  public static final int LEVEL_MEMBER = 1;
  public static final int LEVEL_ADMIN = 2;
  
  // 결제 유형 
  public static final int PAY_CARD = 0;
  public static final int PAY_CASH = 1;
  public static final int PAY_POINT = 2;
  
  // 배달 유형
  public static final int DELIVERY_BOX = 0;
  public static final int DELIVERY_POST = 1;
  public static final int DELIVERY_QUICK = 2;
}





