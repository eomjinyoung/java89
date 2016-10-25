package step09.ex1;

import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    //1) 사용자로부터 값을 입력받을 때 사용할 입력 도구 준비
    Scanner keyScan = new Scanner(System.in);

    Student student = new Student();
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

    System.out.printf("아이디: %s\n", student.userId);
    System.out.printf("암호: %s\n", student.password);
    System.out.printf("이름: %s\n", student.name);
    System.out.printf("전화: %s\n", student.tel);
    System.out.printf("이메일: %s\n", student.email);
    System.out.printf("재직여부: %b\n", student.working);
    System.out.printf("태어난해: %d\n", student.birthYear);
    System.out.printf("학교: %s\n", student.school);
  }
}

/*






*/
