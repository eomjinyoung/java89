// 주제: 사용자 정의 타입의 인스턴스 - 응용 II
// => 반복문을 이용하여 배열을 처리하라!

package step07;

public class Exam059_3 {
  public static void main(String[] args) {
    //1) 레퍼런스 변수 3개 준비
    Student[] arr = new Student[3]; // 레퍼런스 배열을 3개 준비한다.
                                    // Student 인스턴스가 아니다.
                                    // => Student s1, s2, s3; 와 같은 의미이다.
    //2) 각 레퍼런스 변수에 Student 인스턴스 주소를 저장한다.
    arr[0] = new Student();
    arr[1] = new Student();
    arr[2] = new Student();

    //3) 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
    arr[0].name = "홍길동";
    arr[0].email = "hong@test.com";
    arr[0].tel = "111-1111";
    arr[0].age = 20;
    arr[0].working = true;

    arr[1].name = "임꺽정";
    arr[1].email = "leem@test.com";
    arr[1].tel = "111-1112";
    arr[1].age = 30;
    arr[1].working = false;

    arr[2].name = "유관순";
    arr[2].email = "yoo@test.com";
    arr[2].tel = "111-1113";
    arr[2].age = 40;
    arr[2].working = true;

    //4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
    for (Student student : arr) {
      printStudent(student);
    }
  }

  // printStudent() 메서드 정의
  static void printStudent(Student student) {
    System.out.printf("%s,%s,%s,%d,%b\n",
      student.name, student.email, student.tel, student.age, student.working);
  }

}

/*
#









*/
