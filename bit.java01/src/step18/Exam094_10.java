/* 퀴즈: 현재 폴더 및 그 하위 폴더의 모든 파일 정보를 출력하라!
=> 재귀 호출을 사용하여 처리하라!
> java -cp bin step18.Exam094_10 src
src/Exam001.java
src/Exam002.java
src/Exam003.java
...
src/step01/Exam010.java
src/step01/Exam020.java
...
src/step18/ex1/LinkedList.java
src/step18/ex1/Test1.java
...
*/
package step18;

import java.io.File;
import java.io.FileFilter;

public class Exam094_10 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_9 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    printFileInfo(f1);
    
  }

  static void printFileInfo(File dir) {
    File[] files = dir.listFiles();
    for (File file : files) { 
      if (file.isFile()) {
        System.out.println(file.getPath());
      } else { 
        printFileInfo(file);
      }
    }
  }
}