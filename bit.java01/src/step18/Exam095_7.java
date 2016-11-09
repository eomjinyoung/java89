/* 주제: FileOutputStream 클래스 사용법 - write() 사용법 
=> 다양한 형식의 데이터를 출력하라!

*/
package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_7 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_7.data");

    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 100;
    int sum = kor + eng + math;
    boolean working = false;

    // 위의 데이터를 출력하라!
    byte[] bytes = name.getBytes("UTF-8");
    out.write(bytes.length >> 8);
    out.write(bytes.length);
    out.write(bytes);
    
    out.write(kor >> 24);
    out.write(kor >> 16);
    out.write(kor >> 8);
    out.write(kor);
    out.write(eng >> 24);
    out.write(eng >> 16);
    out.write(eng >> 8);
    out.write(eng);
    out.write(math >> 24);
    out.write(math >> 16);
    out.write(math >> 8);
    out.write(math);
    out.write(sum >> 24);
    out.write(sum >> 16);
    out.write(sum >> 8);
    out.write(sum);
    out.write(working ? 1 : 0);

    out.close();
    
  }
}