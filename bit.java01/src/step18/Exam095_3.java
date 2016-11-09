/* 주제: FileOutputStream 클래스 사용법 - write() 사용법 
=> 4바이트 출력하기

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_3 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_3.data");

    // int 변수의 값을 출력하라!
    int value = 0xaabbccdd;
    
    out.write(value >> 24); //0x000000aa|bbccdd
    out.write(value >> 16); //0x0000aabb|ccdd
    out.write(value >> 8); //0x00aabbcc|dd
    out.write(value); //0xaabbccdd|

    out.close();
  }
}