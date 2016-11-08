/* 주제: 인터페이스 사용 후 */
package step18.ex2;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    // Nested class: Local Class
    // => 오직 이 메서드 안에서만 사용할 수 있다.
    class MyConsumer implements Consumer {
      public void execute(int index, Object value) {
        System.out.printf("%d => %s\n", index, value);
      }
    }

    list.forEach(new MyConsumer());
  }
}