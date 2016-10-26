package step09.ex3;

import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    //여러명의 학생 정보를 입력하기 위한 레퍼런스 배열을 만든다.
    Student[] students = new Student[100];
    int length = 0; // 레퍼런스 배열에 몇명의 학생 정보를 저장했는지 개수를 보관한다.
                    // 레퍼런스 배열에 몇 개의 Student 인스턴스가 들어 있는지 그 개수를 보관한다.

    Scanner keyScan = new Scanner(System.in);

    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();
      System.out.println(command);
    }

  }

  static void printStudentList(Student[] students, int length) {
    for (int i = 0; i < length; i++) {
      Student student = students[i];
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
