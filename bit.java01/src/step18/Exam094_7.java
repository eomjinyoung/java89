/* 주제: File 클래스 사용법 - FilenameFilter를 사용하기 후
*/
package step18;

import java.io.File;
import java.io.FilenameFilter;

public class Exam094_7 {
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
    String[] filenames = f1.list(new TextFileFilter());

    for (String filename : filenames) {
      System.out.printf("%s\n", filename);
    }
  }

  // FilenameFilter 계약을 준수하는 클래스 만들기
  // 1) 클래스 선언부에 계약 사항을 명시해야 한다.
  //    예) class 클래스명 implements 계약서명, ... {}
  // 2) 계약서에 선언되어 있는 모든 메서드를 만들어야 한다.
  static class JavaFileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith(".java"))
        return true;
      return false;
    }
  }

  static class TextFileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith(".txt"))
        return true;
      return false;
    }
  }
}