/* 주제: 객체 입출력 - 직렬화와 transient
=> 인스턴스 변수 중에서 내부 인스턴스 변수들의 계산 결과를 담는 변수가 있다면, 
   그 변수의 값은 굳이 출력할 필요가 없다.
   받는 쪽에서 새로 계산을 해야 한다. 그래야만 데이터의 신뢰성이 확보된다.
=> 예를 들면,
   Score 클래스의 경우 국어,영어,수학 점수를 받아서 합계와 평균을 갖는 변수가 있다.
   만약 직렬화를 수행한다면 국,영,수 외에서 합계와 평균도 출력될 것이다.
   만약 보내는 쪽에서 합계 또는 평균을 왜곡한다면 받는쪽에서는
   잘못된 계산결과를 사용하게 될 것이다.
   이런 경우를 원천적으로 차단하기 위해서는 계산 결과를 출력하지 않는 것이 좋다.
=> 이번 예제는 총점과 평균을 모두 출력하는 예이다. 
 */
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam103_3 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_3.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);

    out2.writeObject(new Score("홍길동", 100, 100, 100));
    out2.writeObject(new Score("임꺽정", 90, 90, 90));
    out2.writeObject(new Score("유관순", 80, 80, 97));

    out2.close();
    out.close();
    
    System.out.println("출력 완료!");
  }
}