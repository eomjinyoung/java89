// 주제: 객체지향 핵심 문법 - 여러 개의 생성자 정의하기

package step08;

public class Exam060_4 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book() {}

    Book(String title) {
      System.out.println("Book(String) 호출");
    }

    Book(String title, String author) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.author = author;
    }

    Book(String title, String press, int price) {
      System.out.println("Book(String,String,int) 호출");
      this.title = title;
      this.press = press;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    // 여러 개의 생성자가 있을 때, 호출할 생성자를 선택하는 방법?
    // => 넘기는 값으로 선택할 수 있다.
    // => 즉 어떤 값을 넘겨주는냐에 따라 호출할 생성자가 결정된다.

    Book b1 = new Book();
    Book b2 = new Book("자바 프로그래밍"); // String 한 개 받는 생성자 호출
    Book b3 = new Book("자바 프로그래밍", "홍길동"); // String 두 개 받는 생성자 호출
    Book b4 = new Book("자바 프로그래밍", "비트출판사", 30000); // String 두 개와 int 한 개 받는 생성자 호출
    //Book b5 = new Book(30000, 890); // 컴파일 오류! int 두 개 받는 생성자가 없다.
  }
}

/*
# 오버로딩(overloading)
- 파라미터 개수나 파라미터 타입, 순서가 다르더라도
  같은 기능을 하는 메서드에 대해
  같은 이름을 부여함으로써
  프로그래밍에 일관성을 주는 문법










*/
