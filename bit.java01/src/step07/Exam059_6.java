// 주제: 사용자 정의 타입의 인스턴스 - 응용 V
// => 인스턴스 주소를 자동으로 받는 메서드 사용법

package step07;

public class Exam059_6 {
  public static void main(String[] args) {
    //1) 레퍼런스 변수 3개 준비
    Student3[] arr = new Student3[3]; // 레퍼런스 배열을 3개 준비한다.
                                    // Student 인스턴스가 아니다.
                                    // => Student s1, s2, s3; 와 같은 의미이다.
    //2) 각 레퍼런스 변수에 Student 인스턴스 주소를 저장한다.
    arr[0] = new Student3();
    arr[1] = new Student3();
    arr[2] = new Student3();

    //3) 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
    arr[0].init("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1].init("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2].init("유관순", "yoo@test.com", "111-1113", 40, true);

    //4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
    for (Student3 student : arr) {
      student.printStudent();
    }
  }


}

/*
# 스태틱 메서드
- 스태틱 메서드는 클래스 이름으로 호출한다.
  예) Student2.init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
- 스태틱 메서드는 this라는 빌트인 변수가 없다.

# 인스턴스 메서드
- 인스턴스 메서드는 인스턴스 주소를 가지고 호출한다.
  arr[0].init("홍길동", "hong@test.com", "111-1111", 20, true);
- 만약 인스턴스 주소를 안주고 호출하면 컴파일 오류 발생!
- 인스턴스 메서드는 인스턴스 주소를 받는 this라는 빌트인 변수가 있다.
- 주의!
  혹시 인스턴스 메서드라는 이름 때문에 인스턴스를 생성할 때
  이 메서드도 함께 생성될거라고 생각하지 말라!
  스태틱 메서드든 인스턴스 메서드든 모두 Method Area 영역에 존재한다.





*/
