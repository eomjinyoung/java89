/* 주제: 제네릭의 정의와 사용
=> 제네릭은 타입 이름을 메서드의 파라미터 처럼 클래스에 넘겨주는 기술이다.
   타입 이름를 받은 클래스는 내부에서 변수처럼 타입을 사용할 수 있다.
=> 제네릭 사용 이점
  1) 특정 데이터 타입 별로 클래스 또는 메서드를 만들 필요가 없다.
  2) 특정 데이터 타입에 종속되지 않고 모든 타입의 값을 다루려면
     보통 Object 타입의 레퍼런스를 사용하여 데이터를 다루게 되는데,
     문제는 값을 꺼낼 때 마다 타입 캐스팅(형변환)을 해야 한다.
     => 이것을 해결하기 위해 타입 이름을 파라미터 처럼 클래스에 넘겨주는 제네릭이 등장하였다.
     즉 제네릭을 사용하여 타입 캐스팅 할 필요가 없다.
  3) 어떤 클래스가 다루는 데이터의 타입을 특정 타입으로 제한할 수 있다.
*/

package step13.v5;
import java.util.Scanner;

public class Test  {
  // 제네릭이 적용된 클래스를 사용할 때는
  // 그 클래스가 다루는 데이터의 타입 이름을 파라미터로 넘겨줘야 한다.
  // => 클래스명<타입명> 변수명 = new 클래스명<타입명>();
  static LinkedList<Student> list;
  static Scanner keyScan;

  static {
    list = new LinkedList<Student>();
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
      Student student = list.get(i);
      System.out.printf("%s, %d, %s\n", student.name, student.age, student.tel);
    }
  }

  static void doGet() {
    System.out.print("인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    Student student = list.get(index);
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
