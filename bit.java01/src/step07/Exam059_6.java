// 주제: 사용자 정의 타입의 인스턴스 - 응용 V
// => 인스턴스 주소를 자동으로 받는 메서드 사용법

package step07;

public class Exam059_6 {
  public static void main(String[] args) {
    //1) 레퍼런스 변수 3개 준비
    Student2[] arr = new Student2[3]; // 레퍼런스 배열을 3개 준비한다.
                                    // Student 인스턴스가 아니다.
                                    // => Student s1, s2, s3; 와 같은 의미이다.
    //2) 각 레퍼런스 변수에 Student 인스턴스 주소를 저장한다.
    arr[0] = new Student2();
    arr[1] = new Student2();
    arr[2] = new Student2();

    //3) 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
    Student2.init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
    Student2.init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
    Student2.init(arr[2], "유관순", "yoo@test.com", "111-1113", 40, true);

    //4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
    for (Student2 student : arr) {
      Student2.printStudent(student);
    }
  }


}

/*
# 메서드 분류
- 서로 관련이 있는 메서드를 잘 분류해 놓으면
  나중에 유지보수 할 때 빠르게 해당 메서드를 찾고 변경할 수 있어 좋다.
- 작업목표
  => init(), printStudent()는 Student 데이터는 다루는 메서드이다.
  => 이런 경우 해당 메서드들을 그 데이터를 정의한 클래스에 두는 것이
     유지보수에 좋다.
  => init(), printStudent()를 Student 클래스로 옮긴다.
  => 이렇게 하기 위해서 기존의 Student를 복제하여 Student2로 만들어 사용한다.
     왜? 기존 예제를 그대로 두어 변경 전과 후를 참고하기 위해서.

# 인스턴스와 메서드
- 인스턴스란 클래스 설계도에 따라 준비한 메모리를 말한다.
- 어떤 메모리? 변수 선언 메모리.
  주의! 메서드는 인스턴스 만들 때 함께 만들어지는 것이 아니다.
  메서드는 Method Area 영역에 존재한다. 왜? 명령어이기 때문이다.







*/
