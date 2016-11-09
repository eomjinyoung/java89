/* 주제: FileOutputStream 클래스 사용법 - write() 사용법 
=> 1바이트 출력하기

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_2 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_2.data");

    // write()의 파라미터는 int 이지만 출력은 맨 끝 1바이트만 출력한다.
    out.write(0x72f13a);
    out.write(0x1b4a8830);
    out.write(0xccdd);

    out.close();
  }
}