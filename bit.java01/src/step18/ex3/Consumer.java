/* 계약서 작성:
=> LinkedList에서 호출할 메서드의 규칙을 정한다.
=> 다른 개발자는 이 규칙에 따라 클래스를 만든다.
*/
package step18.ex3;

public interface Consumer {
  // 계약서 규칙을 정의할 때 메서드 시그너처(signature; 리턴타입,메서드명,파라미터)
  // 만 선언해야 한다. 왜? 규칙이니까!
  // 규칙을 준수하는 쪽에서 이 규칙대로 클래스를 만들면 된다.
  // 다음 규칙의 내용은 무엇인가?
  // LinkedList에서 반복문을 사용하여 목록을 꺼낼 때 마다
  // 다음 규칙으로 된 메서드를 호출할 것이다. 
  void execute(int index, Object value);
}