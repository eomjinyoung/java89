/* Quiz
클래스 문법을 이용하여 쇼핑몰의 한 개 제품 정보를 저장하고 출력하라!
*/
package step03.test;

public class Test3 {
  //1) 새 데이터 타입을 정의한다.
  static class Product {
    String name;
    String maker;
    String description;
    int price;
    int quantity;
    boolean used;
  }

  public static void main(String[] args) {
    //2) Product 타입의 메모리를 준비한다.
    Product prod1 = new Product();

    //3) 준비한 Product 메모리에 값을 저장한다.
    prod1.name = "아이폰";
    prod1.maker = "애플";
    prod1.description = "스마트폰";
    prod1.price = 700000;
    prod1.quantity = 120;
    prod1.used = false;

    //4) 값 꺼내기 
    System.out.println(prod1.name);
    System.out.println(prod1.maker);
    System.out.println(prod1.description);
    System.out.println(prod1.price);
    System.out.println(prod1.quantity);
    System.out.println(prod1.used);

  }
}
/*









*/
