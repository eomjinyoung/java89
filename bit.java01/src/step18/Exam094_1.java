/* 주제: File 클래스 사용법 - 파일 정보 다루는 방법
*/
package step18;

import java.io.File;

public class Exam094_1 {
  public static void main(String[] args) throws Exception {
    File f1 = new File("test.txt");
    boolean b = f1.exists();
    System.out.println(b);
    
    File f2 = new File("../intro/Hello.java");
    System.out.println(f2.exists()); // 파일의 존재 여부
    System.out.println(f2.getName()); // 파일명
    System.out.println(f2.getAbsolutePath()); // 절대 경로(원래의 형식으로 유지)
    System.out.println(f2.getCanonicalPath()); // 절대 경로(최적화된 형식)
    System.out.println(f2.getPath()); // 파일 경로
    System.out.println(f2.length()); // 파일 길이
    System.out.println(f2.isFile()); // 파일 여부 
    System.out.println(f2.isDirectory()); // 디렉토리 여부

  }
}