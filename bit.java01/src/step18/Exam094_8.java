/* 주제: File 클래스 사용법 - FilenameFilter와 Lambda 문법
*/
package step18;

import java.io.File;
import java.io.FilenameFilter;

public class Exam094_8 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_8 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    // FilenameFilter를 람다 문법을 사용하여 처리한다.
    // => 필터가 어떤 작업을 수행하는지 알기 위해 클래스를 찾아갈 필요가 없다. 
    // => 바로 괄호() 안에 필터의 작업이 기술되어 있기 때문에
    //    코드를 이해하기 쉽다.
    String[] filenames = f1.list((dir, name) -> {
      if (name.endsWith(".java"))
        return true;
      return false;
    });

    for (String filename : filenames) {
      System.out.printf("%s\n", filename);
    }
  }
}