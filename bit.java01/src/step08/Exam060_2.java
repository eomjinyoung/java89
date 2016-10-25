// 주제: 객체지향 핵심 문법 - 기본 생성자 정의하기

package step08;

public class Exam060_2 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book() {
      System.out.println("Book() 호출");
    }
  }

  public static void main(String[] args) {
    Book b1 = new Book();
  }
}

/*

*/
