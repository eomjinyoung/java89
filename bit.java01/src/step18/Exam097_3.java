/* 주제: 버퍼의 사용 - FileInputStream을 확장하여 버퍼 기능 추가하기 II
=> 상속 문법을 이용하지 않고 기능 확장
*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam097_3 {
  static class BufferedInputStream {
    FileInputStream in;
    byte[] buf = new byte[8192];
    int length;
    int cursor;

    public BufferedInputStream(FileInputStream in) {
      this.in = in;
    }

    public int read() throws IOException {
      if (cursor == length) { 
        length = in.read(buf);
        cursor = 0; 
        if (length == -1) 
          return -1;     
      }
      
      return buf[cursor++] & 0x000000FF; 
    }

    public void close() throws IOException {
      in.close();
    }
  }

  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("temp/jls8.pdf");
    BufferedInputStream in = new BufferedInputStream(in0);

    long startMillis = System.currentTimeMillis();

    int count = 0;
    while (in.read() != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}