/* 주제: 생성자 - 생성자에서 동료 생성자 호출하기
=> this() 사용 전
*/

package step10;

import java.util.Scanner;

public class Exam067_0 {

  static class Book {
    String title;
    String author;
    String press;
    int pages;
    boolean local;

    public Book() {}

    public Book(String title) {
      this.title = title;
    }

    public Book(String title, String press) {
      this.title = title;
      this.press = press;
    }

    public Book(String title, String press, String author, int pages) {
      this.title = title;
      this.press = press;
      this.author = author;
      this.pages = pages;
    }


  }

  public static void main(String[] args) {
    Book book = new Book(); // 기본 값으로 초기화된 인스턴스 만들기
    Book book2 = new Book("자바프로그래밍");
    Book book3 = new Book("자바프로그래밍", "비트출판사");
    Book book4 = new Book("자바프로그래밍", "비트출판사", "홍길동", 780);
  }
}

/*
# 기본 생성자 (파라미터가 없는 생성자)
- 생성자가 단 한 개라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.










*/
