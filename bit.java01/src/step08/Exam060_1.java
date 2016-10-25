// 주제: 객체지향 핵심 문법 - 기본 생성자

package step08;

public class Exam060_1 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    // 생성자가 없으면 다음과 같은 기본 생성자를 컴파일러가 자동으로 추가한다.
    /*
    public Book() {} // 물론 아무것도 안한다.
    */
  }

  public static void main(String[] args) {
    Book b1 = new Book();
  }
}

/*
# new Book() 문법의 의미
new : Heap 영역에 메모리를 준비하라.
Book : Book 설계도에 맞추어
() : 준비된 메모리를 초기화시킬 때 "기본 생성자"를 호출하라.

# 기본 생성자
- 파라미터가 없는 생성자
- 클래스에 생성자가 한 개도 없으면 자동으로 컴파일러가 생성해준다.
- 만약 생성자가 한 개라도 있으면 컴파일러는 자동으로 생성자를 만들지 않는다.
- 자바에서는 생성자가 없는 클래스가 존재할 수 없다.

*/
