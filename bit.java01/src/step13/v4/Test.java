package step13.v4;
import java.util.Scanner;

public class Test  {
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
    System.out.print("학생정보(예: 홍길동,20,111-1111)? ");
    String[] values = keyScan.nextLine().split(",");

    Student student = new Student();
    student.name = values[0].trim();
    student.age = Integer.parseInt(values[1].trim());
    student.tel = values[2].trim();

    list.add(student);
  }

  static void doList() {
    for (int i = 0; i < list.size(); i++) {
      Student student = (Student)list.get(i);
      System.out.printf("%s, %d, %s\n", student.name, student.age, student.tel);
    }
  }

  static void doGet() {
    System.out.print("인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    Student student = (Student)list.get(index);
    System.out.printf("이름: %s\n", student.name);
    System.out.printf("나이: %d\n", student.age);
    System.out.printf("전화: %s\n", student.tel);

  }

  static void doDelete() {
    System.out.print("삭제할 값의 인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    list.remove(index);
  }
}
