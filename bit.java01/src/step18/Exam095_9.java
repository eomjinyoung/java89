/* 주제: FileOutputStream 클래스 사용법 - byte 유효 값 범위를 넘어가는 값 출력 
=> byte 값 유효범위: 
   0111 1111 (127)
   ...
   0000 0010 (2)
   0000 0001 (1)
   0000 0000 (0)
   1111 1111 (-1)
   1111 1110 (-2)
   ...
   1000 0000 (-128) 

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_9 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_9.data");
    
    out.write(136); // 0x00000088
    out.write(153); // 0x00000099
    out.write(170); // 0x000000aa
    out.write(187); // 0x000000bb
    out.write(204); // 0x000000cc

    out.close();
  }
}