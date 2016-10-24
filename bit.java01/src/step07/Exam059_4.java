// 주제: 사용자 정의 타입의 인스턴스 - 응용 III
// => 메서드를 이용하여 객체를 초기화한다.

package step07;

public class Exam059_4 {
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
    init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
    init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
    init(arr[2], "유관순", "yoo@test.com", "111-1113", 40, true);

    //4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
    for (Student student : arr) {
      printStudent(student);
    }
  }
  // init() 메서드 정의
  static void init(Student student, String name, String email, String tel, int age, boolean working) {
    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;
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
