package step09.ex2;

import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    //여러명의 학생 정보를 입력하기 위한 레퍼런스 배열을 만든다.
    Student[] students = new Student[100];
    int length = 0; // 레퍼런스 배열에 몇명의 학생 정보를 저장했는지 개수를 보관한다.
                    // 레퍼런스 배열에 몇 개의 Student 인스턴스가 들어 있는지 그 개수를 보관한다.

    Scanner keyScan = new Scanner(System.in);

    // 반복 해서 입력 받는다.
    Student student = null; // null ? 주소 없음을 의미한다.
    while (length < students.length) {
      student = new Student();
      System.out.print("아이디(:hong)? ");
      student.userId = keyScan.nextLine();

      System.out.print("암호(예:1111)? ");
      student.password = keyScan.nextLine();

      System.out.print("이름(예:홍길동)? ");
      student.name = keyScan.nextLine();

      System.out.print("전화(예:010-1111-2222)? ");
      student.tel = keyScan.nextLine();

      System.out.print("이메일(예:hong@test.com)? ");
      student.email = keyScan.nextLine();

      System.out.print("재직중(y/n)? ");
      student.working = (keyScan.nextLine().equals("y")) ? true : false;

      System.out.print("태어난해(예:1980)? ");
      student.birthYear = Integer.parseInt(keyScan.nextLine());

      System.out.print("최종학교(예:비트고등학교)? ");
      student.school = keyScan.nextLine();

      students[length++] = student;

      System.out.print("계속 입력하시겠습니까(y/n)? ");
      if (!keyScan.nextLine().equals("y"))
        break;
    }

    printStudentList(students, length);

  }

  static void printStudentList(Student[] students, int length) {
    Student student = null;
    for (int i = 0; i < length; i++) {
      student = students[i];
      System.out.printf("%s,%s,%s,%s,%s,%s,%d,%s\n",
        student.userId,
        student.password,
        student.name,
        student.tel,
        student.email,
        ((student.working)?"yes":"no"),
        student.birthYear,
        student.school);
    }
  }
}

/*






*/
