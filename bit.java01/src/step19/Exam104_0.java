/* 주제: 입출력과 예외 처리 
 */
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam104_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_5.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);

    out2.writeObject(new Score2("홍길동", 100, 100, 100));
    out2.writeObject(new Score2("임꺽정", 90, 90, 90));
    out2.writeObject(new Score2("유관순", 80, 80, 97));

    out2.close();
    out.close();
    
    System.out.println("출력 완료!");
  }
}