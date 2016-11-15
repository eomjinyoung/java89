/* 주제: 객체 입출력 - 직렬화와 transient II
- transient 적용 전 
- 합계와 평균도 국,영,수 데이터와 함께 읽는다. 
*/
package step19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam103_4 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam103_3.data");
    ObjectInputStream in2 = new ObjectInputStream(in);
    
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());

    in2.close();
    in.close();
  }
}