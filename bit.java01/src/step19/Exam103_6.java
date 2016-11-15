/* 주제: 객체 입출력 - 직렬화와 transient 
- transient 적용  
  transient가 적용된 인스턴스 변수의 값은 초기화된 채로 비어 있다.
- 데이터를 읽은 후 별도로 계산을 수행해야 한다.
  compute() 메서드를 공개하라!
- 아니, Exam103_4.java 보다 코드가 더 복잡해졌다. 나쁜거 아니냐?
  => 데이터를 읽고 난 후에 compute()를 호출해야 하기 때문에
     코드는 더 많아지고 복잡해졌다.
  => 하지만 합계와 평균 데이터의 신뢰성은 더 높아졌다.
     이렇게 데이터 신뢰성을 위해 직렬화에서 제외하는 변수가 존재할 수 있다.
     그런 변수는 반드시 transient를 붙여라.
     물론, 그 대가로 데이터를 읽는 쪽에서는 출력하지 않은 변수의 값은
     따로 계산해야 하는 불편함은 있다.
*/
package step19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam103_6 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam103_5.data");
    ObjectInputStream in2 = new ObjectInputStream(in);
    
    Score2 score = (Score2)in2.readObject();
    score.compute();
    System.out.println(score);
    
    score = (Score2)in2.readObject();
    score.compute();
    System.out.println(score);
    
    score = (Score2)in2.readObject();
    score.compute();
    System.out.println(score);
    

    in2.close();
    in.close();
  }
}