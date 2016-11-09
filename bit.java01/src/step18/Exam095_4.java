/* 주제: FileOutputStream 클래스 사용법 - write() 사용법 
=> 바이트 배열 출력하기

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_4 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_4.data");

    byte[] buf = {0x11,0x22,0x33,0x44,0x55,0x66,0x77,0x78,0x79,0x7a};
    
    // 바이트 배열을 한 번에 출력하기
    out.write(buf); // 바이트 배열의 주소를 주면 그 배열의 값을 모두 출력한다.

    out.close();
    
  }
}