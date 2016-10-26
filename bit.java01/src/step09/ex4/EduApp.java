package step09.ex4;

import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    // EduApp에서 사용하는 keyScan을 StudentController와 공유한다.
    StudentController.keyScan = keyScan;

    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
      case "add": StudentController.doAdd(); break;
      case "list": StudentController.doList(); break;
      case "view": StudentController.doView(); break;
      case "quit":
        System.out.println("Good bye!");
        break loop;
      default:
        System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }
}

/*






*/
