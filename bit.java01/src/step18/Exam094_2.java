/* 주제: File 클래스 사용법 - 파일 생성하기
*/
package step18;

import java.io.File;

public class Exam094_2 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_2 파일명");
      return;
    }

    // 파일명을 입력받아 빈 파일을 생성해보자!
    File f1 = new File(args[0]);
    if (f1.exists()) {
      System.out.println("이미 해당 파일이 존재합니다.");
      return;
    }

    f1.createNewFile();
    System.out.println("파일을 생성하였습니다.");
    
  }
}