package step09.ex6;

import java.util.Scanner;

public class StudentController {
  Student[] students = new Student[100];
  int length = 0;
  Scanner keyScan;

  // 기본 생성자가 없다.
  // 따라서 이 클래스를 사용하려면 반드시 Scanner를 줘야 한다.
  // => 생성자에서 하는 일은 그 객체를 사용하기 전에 유효 상태로 만드는 것이다.
  public StudentController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doList() {
    for (int i = 0; i < this.length; i++) {
      Student student = this.students[i];
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

  public void doAdd() {
    // 반복 해서 입력 받는다.
    while (length < this.students.length) {
      Student student = new Student();
      System.out.print("아이디(:hong)? ");
      student.userId = this.keyScan.nextLine();

      System.out.print("암호(예:1111)? ");
      student.password = this.keyScan.nextLine();

      System.out.print("이름(예:홍길동)? ");
      student.name = this.keyScan.nextLine();

      System.out.print("전화(예:010-1111-2222)? ");
      student.tel = this.keyScan.nextLine();

      System.out.print("이메일(예:hong@test.com)? ");
      student.email = this.keyScan.nextLine();

      System.out.print("재직중(y/n)? ");
      student.working = (this.keyScan.nextLine().equals("y")) ? true : false;

      System.out.print("태어난해(예:1980)? ");
      student.birthYear = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("최종학교(예:비트고등학교)? ");
      student.school = this.keyScan.nextLine();

      this.students[length++] = student;

      System.out.print("계속 입력하시겠습니까(y/n)? ");
      if (!this.keyScan.nextLine().equals("y"))
        break;
    }
  }

  public void doView() {
    System.out.print("조회할 학생의 아이디는? ");
    String userId = this.keyScan.nextLine().toLowerCase();
    for (int i = 0; i < this.length; i++) {
      if (this.students[i].userId.toLowerCase().equals(userId)) {
        System.out.printf("아이디: %s\n", this.students[i].userId);
        System.out.printf("암호: (***)\n");
        System.out.printf("이름: %s\n", this.students[i].name);
        System.out.printf("전화: %s\n", this.students[i].tel);
        System.out.printf("이메일: %s\n", this.students[i].email);
        System.out.printf("재직중: %s\n", (this.students[i].working) ? "Yes" : "No");
        System.out.printf("태어난 해: %d\n", this.students[i].birthYear);
        System.out.printf("학교: %s\n", this.students[i].school);
        break;
      }
    }
  }

  public void doDelete() {
    System.out.print("삭제할 학생의 아이디는? ");
    String userId = this.keyScan.nextLine().toLowerCase();

    for (int i = 0; i < this.length; i++) {
      if (this.students[i].userId.toLowerCase().equals(userId)) {
        // 배열의 앞 항목의 값을 현재 항목으로 당겨온다.
        for (int x = i + 1; x < this.length; x++, i++) {
          this.students[i] = this.students[x];
        }
        this.students[--length] = null;

        System.out.printf("%s 학생 정보를 삭제하였습니다.\n", userId);
        return; // 함수 실행을 종료한다.
      }
    }
    System.out.printf("%s 학생이 없습니다.\n", userId);
  }
}
