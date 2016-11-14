/* 주제: 바이트 스트림과 캐릭터 스트림 - 바이트 스트림 출력
=> InputStream/OutputStream 계열의 클래스
=> FileOutputStream은 바이트 배열을 그대로 출력
*/
package step19;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exam100_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam100_0.data");
    
    String str = "ABCabc012가각간"; // UTF-16 인코딩으로 char[] 배열에 저장된다. 
    // char[] value = {0041 0042 0043 0061 0062 0063 0030 0031 0032 ac00 ac01 ac04};

    //byte[] bytes = str.getBytes("UTF-16");
    byte[] bytes = str.getBytes("UTF-8");

    out.write(bytes); // 파라미터로 주어진 바이트 배열을 그대로 출력 

    out.close();
  }
}