/* 주제: File 클래스 사용법 - 디렉토리의 파일 목록 뽑아내기 II
*/
package step18;

import java.io.File;

public class Exam094_5 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_4 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    // f1 의 디렉토리에 들어있는 파일(디렉토리 포함) 정보를 가져온다.
    File[] files = f1.listFiles();
    for (File file : files) {
      System.out.printf("%s %5d %s\n", 
        (file.isDirectory() ? "d" : "-"), file.length(), file.getName());
    }
  }
}