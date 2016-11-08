/* 주제: 인터페이스 사용 전 */
package step18.ex1;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    for (int i = 0; i < list.size(); i++) {
      System.out.printf("%d: %s\n", i, list.get(i));
    }
  }
}