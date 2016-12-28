/* 주제: 스프링 IoC 컨테이너 준비2
 * => 스프링 설정 파일을 OS 파일 시스템 경로에서 찾는다.
 */
package step28.ex1;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest02 {
  public static void main(String[] args) {
    // 현재 위치는 JVM을 실행하는 프로젝트 폴더이다.
    File f = new File("src/step28/ex1/application-context.xml");
    System.out.println(f.getAbsolutePath());
    
    ApplicationContext iocContainer;
    iocContainer = new FileSystemXmlApplicationContext(
        "file:" + f.getAbsolutePath());
    
    System.out.println("실행완료!");
    
  }
}








