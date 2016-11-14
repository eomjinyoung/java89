/* 주제: 바이트 스트림과 캐릭터 스트림 - 바이트 스트림 II
=> FileInputStream
   바이트 배열을 그대로 읽는다.
*/
package step19;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam100_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam100_0.data");
    
    byte[] buf = new byte[1024];
    int len = in.read(buf);

    for (int i = 0; i < len; i++) {
      System.out.printf("%x ", buf[i]);
    }
    System.out.println();

    in.close();
  }
}