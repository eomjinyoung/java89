/* 주제: 버퍼의 사용 - FileInputStream을 확장하여 버퍼 기능 추가하기

*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam097_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls8.pdf");

    //1) 읽기 전 시각 측정
    //=> 1970년 1월 1일 0시 0분 0초부터 지금까지 경과된 밀리초
    long startMillis = System.currentTimeMillis();

    int count = 0;
    byte[] buf = new byte[8192];
    while (in.read(buf) != -1) count++;

    //2) 읽은 후 시각 측정
    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}