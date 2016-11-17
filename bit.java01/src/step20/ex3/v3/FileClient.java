/* ver 3: 사용자로부터 파일명을 입력 받아라!
 - 실행 결과
 * 파일? jls8.pdf (입력)
 * 파일명: jls8.pdf
 * 파일크기: 3,980,659
 * 파일을 모두 읽었습니다.
 */
package step20.ex3.v3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("파일? ");
    String filename = keyScan.nextLine();
    
    File file = new File(filename);
    System.out.printf("파일명: %s\n", file.getName());
    System.out.printf("파일크기: %s\n", file.length());
    
    BufferedInputStream in = new BufferedInputStream(
                                new FileInputStream(file));
    while (true) {
      int b = in.read();
      if (b == -1) 
        break;
    }
    System.out.println("파일을 모두 읽었습니다.");
    in.close();
    keyScan.close();
  }
}
