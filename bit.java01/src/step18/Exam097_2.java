/* 주제: 버퍼의 사용 - FileInputStream을 확장하여 버퍼 기능 추가하기

*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam097_2 {
  static class BufferedInputStream extends FileInputStream {
    byte[] buf = new byte[8192];
    int length;
    int cursor;

    public BufferedInputStream(String path) throws FileNotFoundException {
      super(path);
    }

    @Override
    public int read() throws IOException {
      if (cursor == length) { // 버퍼에 읽을 데이터가 없다면, 파일에서 버퍼로 데이터를 읽어온다.
        length = super.read(buf); // 원래의 read()를 사용하여 버퍼로 데이터를 읽어온다.
        cursor = 0; // 데이터를 새로 읽어왔으면 커서는 다시 0으로 초기화시킨다.
        if (length == -1) // 만약 파일의 데이터를 다 읽었다면, 즉시 -1을 리턴하여, 
          return -1;      // 파일의 데이터를 모두 읽었음을 호출자에게 알린다.
      }
      
      // 파일에서 버퍼로 데이터를 퍼 왔으면, 버퍼에서 데이터를 하나 꺼내 리턴한다.
      return buf[cursor++] & 0x000000FF; // 맨 끝 1바이트 값만 유효하고 나머진 0으로 
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedInputStream in = new BufferedInputStream("temp/jls8.pdf");

    //1) 읽기 전 시각 측정
    //=> 1970년 1월 1일 0시 0분 0초부터 지금까지 경과된 밀리초
    long startMillis = System.currentTimeMillis();

    int count = 0;
    while (in.read() != -1) count++;

    //2) 읽은 후 시각 측정
    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}