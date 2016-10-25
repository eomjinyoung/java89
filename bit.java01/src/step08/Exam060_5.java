// 주제: 객체지향 핵심 문법 - 오버로딩 규칙

package step08;

public class Exam060_5 {
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

    // 컴파일 오류!
    // => 메서드를 찾을 때 넘겨주는 값의 타입과 개수로 찾는다.
    // => 따라서 파라미터 이름이 다르더라도 타입이 같으면
    //    같은 메서드로 간주하여 중복 선언할 수 없다.
    Book(String title, String press) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.press = press;
    }

    Book(String title, String press, int price) {
      System.out.println("Book(String,String,int) 호출");
      this.title = title;
      this.press = press;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    // 두 명령 모두 같은 타입의 값을 생성자에 전달하기 때문에
    // 메서드를 구분할 수 없다.
    Book b1 = new Book("자바 프로그래밍", "홍길동"); // String 두 개 받는 생성자 호출
    Book b2 = new Book("자바 프로그래밍", "비트출판사"); // String 두 개 받는 생성자 호출
  }
}

/*











*/
