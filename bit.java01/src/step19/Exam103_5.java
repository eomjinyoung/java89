/* 주제: 객체 입출력 - 직렬화와 transient
=> transient를 적용한 Score2 인스턴스를, 직렬화를 이용하여 출력한다. 
 */
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam103_5 {
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