/* 주제: 바이트 스트림과 캐릭터 스트림 - 캐릭터 스트림 출력
=> Reader/Writer 계열의 클래스
=> FileWriter는 char[] 배열의 값을 출력할 때 
   플랫폼의 기본 문자표를 사용하여 인코딩한다.
   예) Windows OS(MS-949), macOS(UTF-8) 
*/
package step19;

import java.io.FileWriter;
import java.io.IOException;

public class Exam100_2 {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("temp/Exam100_2.data");
    
    String str = "ABCabc012가각간"; // UTF-16 인코딩으로 char[] 배열에 저장된다. 
    // char[] value = {0041 0042 0043 0061 0062 0063 0030 0031 0032 ac00 ac01 ac04};

    char[] chars = str.toCharArray();

    out.write(chars, 0, chars.length);  

    out.close();
  }
}