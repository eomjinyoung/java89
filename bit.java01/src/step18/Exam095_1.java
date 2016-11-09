/* 주제: FileOutputStream 클래스 사용법 - 출력 객체 준비 II

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_1 {
  public static void main(String[] args) throws Exception {
    //1) File 객체 대신 경로를 바로 넣어도 된다.
    //=> 지정된 파일이 없으면 만들고, 있으면 덮어쓴다.
    FileOutputStream out = new FileOutputStream("temp/Exam095_1.data");

    //2) 출력하기
    out.write(10);
    out.write(20);
    out.write(30);

    //3) 출력 객체를 사용한 후 출력을 종료한다는 의미로 객체를 닫아야 한다.
    out.close();
  }
}