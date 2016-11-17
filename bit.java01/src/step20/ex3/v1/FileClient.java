/* ver 1: 파일 정보를 출력하라!
 * - 실행 결과
 * 파일명: jls8.pdf
 * 파일크기: 3,980,659
 */
package step20.ex3.v1;

import java.io.File;

public class FileClient {
  public static void main(String[] args) {
    File file = new File("temp/jls8.pdf");
    System.out.printf("파일명: %s\n", file.getName());
    System.out.printf("파일크기: %d\n", file.length());
  }
}
