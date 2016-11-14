/* 주제: 형식이 있는 데이터 입출력 - DataInputStream 사용하기
=> DataOutputStream으로 출력한 데이터를 읽을 때 주로 사용한다.
   데이터의 타입에 따라 자동으로 읽을 바이트의 수를 결정한다. 
*/
package step19;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Exam102_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam102_0.data");
    DataInputStream in2 = new DataInputStream(in);

    // 반드시 파일에 저장된 데이터의 순서대로 읽어야 한다.
    System.out.printf("%s, %d, %b\n", 
      in2.readUTF(), in2.readInt(), in2.readBoolean()); 
    
    System.out.printf("%s, %d, %b\n", 
      in2.readUTF(), in2.readInt(), in2.readBoolean());

    System.out.printf("%s, %d, %b\n", 
      in2.readUTF(), in2.readInt(), in2.readBoolean());  

    in2.close();
    in.close();
  }
}