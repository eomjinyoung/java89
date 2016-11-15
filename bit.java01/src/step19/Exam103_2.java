/* 주제: 객체 입출력 - ObjectInputStream을 사용하여 직렬화 데이터를 읽어 인스턴스로 만든다.
- ObjectInputStream 클래스는 직렬화 데이터를 읽을 때 사용할 수 있다. 
*/
package step19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Exam103_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam103_1.data");
    ObjectInputStream in2 = new ObjectInputStream(in);
    
    Student2 s = (Student2)in2.readObject();
    System.out.println(s);
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());

    in2.close();
    in.close();
  }
}