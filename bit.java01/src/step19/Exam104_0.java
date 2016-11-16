/* 주제: 입출력과 예외 처리 
 */
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam104_0 {
  public static void main(String[] args) {
    FileOutputStream out = null;
    ObjectOutputStream out2 = null;
    
    try {
      out = new FileOutputStream("temp/Exam104_0.data");
      out2 = new ObjectOutputStream(out);
  
      out2.writeObject(new Score2("홍길동", 100, 100, 100));
      out2.writeObject(new Score2("임꺽정", 90, 90, 90));
      out2.writeObject(new Score2("유관순", 80, 80, 97));
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {out2.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }
    
    System.out.println("출력 완료!");
  }
}





