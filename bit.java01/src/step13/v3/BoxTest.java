/* 값을 저장할 때 사용할 메모리를 정의한다.*/
package step13.v3;
import java.util.Scanner;

public class BoxTest  {
  static LinkedList list;
  static Scanner keyScan;

  static {
    list = new LinkedList();
    keyScan = new Scanner(System.in);
  }

  public static void main(String[] args) {
    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();
      switch (command) {
      case "add": doAdd(); break;
      case "list": doList(); break;
      case "get": doGet(); break;
      case "delete": doDelete(); break;
      case "quit": System.out.println("Good Bye~");
        break loop;
      default: System.out.println("명령어가 없습니다");
      }

    }

  }

  static void doAdd() {
    System.out.print("입력할 값? ");
    int value = Integer.parseInt(keyScan.nextLine());
    list.add(value);
  }

  static void doList() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

  static void doGet() {
    System.out.print("인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    System.out.println(list.get(index));
  }

  static void doDelete() {
    System.out.print("삭제할 값의 인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    list.remove(index);
  }
}
