/* 주제: 바이트 스트림과 캐릭터 스트림 - 캐릭터 스트림 읽기
=> FileReader
   플랫폼 기본 문자표로 인코딩 된 데이터를 읽어서 
   자바 UTF-16으로 자동 변환한다.
=> 결론
   바이트 스트림(InputStream/OutputStream 계열 클래스)은 
   바이트 값을 그대로 출력하고 그래도 읽는다.

   캐릭터 스트림(Reader/Writer 계열 클래스)은 
   출력하는 데이터는 플랫폼 기본 문자 코드로 자동 변환되고,
   읽는 데이터는 자바 플랫폼 기본 문자 코드(UTF-16)로 자동 변환된다. 

   따라서 텍스트 데이터를 다룰 때는 Reader/Writer 계열의 클래스를 사용하라!
   왜? 입출력할 때 복잡한 변환 과정을 지정할 필요가 없다.

   그 외 바이트 데이터(바이너리 데이터)를 다룰 때는 InputStream/OutputStream
   클래스를 사용하라! 
   왜? 중간에서 자동 변환 과정이 없이, 순수하게 데이터를 읽고 쓴다.

=> 텍스트 파일과 바이너리 파일을 구분하는 방법?
   - 메모장으로 읽어 들인 후 변경하여 올바른 형식으로 저장할 수 있다면
     텍스트 파일이다. 
     예) .txt, .csv, .html, .css, .java, .js, .rtf, .xml
   - 메모장으로 읽어 들인 후 변경하고 저장했을 때 파일 형식이 깨진다면
     바이너리 파일이다.
     예) .xls, .doc, .ppt, .gif, .avi, .mp3, .mp4, .jpg, .class
     최근의 MS 오피스 파일(.docx, pptx, xlsx)은 XML 형식으로 저장하기 때문에
     텍스트 파일이라 볼 수 있다. 그러나 메모장으로 직접 편집하기에는
     그 형식이 복잡하여 가능한 전용 프로그램을 사용하는 것이 좋다. 
*/
package step19;

import java.io.FileReader;
import java.io.IOException;

public class Exam100_3 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/Exam100_2.data");

    while (true) {
      int ch = in.read(); // 한 개의 문자 코드를 읽는다.
      if (ch == -1) // 파일 끝에 도달했으면, 
        break;
      System.out.printf("%x ", ch);
    }
    System.out.println();

    in.close();
  }
}