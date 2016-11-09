/* 주제: FileOutputStream 클래스 사용법 - 출력 객체 준비 I

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_0 {
  public static void main(String[] args) throws Exception {
    //1) 어떤 파일을 만들 지 파일 정보를 준비한다.
    File file = new File("temp/Exam095_0.data");

    //2) 지정된 파일로 출력을 수행할 객체를 준비한다.
    //=> 지정된 파일이 없으면 만들고, 있으면 덮어쓴다.
    FileOutputStream out = new FileOutputStream(file);

    //3) 출력하기
    out.write(10); // 1바이트 출력 
    out.write(20); // 1바이트 출력
    out.write(30); // 1바이트 출력

    //4) 출력 객체를 사용한 후 출력을 종료한다는 의미로 객체를 닫아야 한다.
    out.close();
  }
}