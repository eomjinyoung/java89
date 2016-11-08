/* 주제: File 클래스 사용법 - 경로 지정하는 방법
*/
package step18;

import java.io.File;

public class Exam094_0 {
  public static void main(String[] args) {
    // 파일의 기본 경로는 JVM을 실행하는 폴더이다.
    // 예) /Users/eomjinyoung/git/java89/bit.java01
    // => 이렇게 기본 경로를 기준으로 파일의 경로를 작성하면, 
    //    이것을 "상대경로"라 부른다.
    File f1 = new File("test.txt");
    
    // 다음과 같이 파일의 경로를 최상위 디렉토리부터 작성하면,
    // "절대 경로"라 부른다.
    File f2 = new File("/Users/eomjinyoung/git/java89/bit.java01/test.txt");

    // 경로에 .. 기호를 사용하여 경로를 이동할 수 있다.
    // .. => 상위 폴더
    // .  => 현재 폴더
    File f3 = new File("../intro/Hello.java");
  }
}