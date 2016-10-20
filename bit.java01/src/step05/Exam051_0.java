// 주제: 명령어 흐름 제어 - 반복문 for(:)

package step05;

public class Exam051_0 {
  public static void main(String[] args) {
    for (String value : args)
      System.out.printf("%s\n", value);
  }
}


/*
# for(변수선언 : 배열 또는 Collection 객체)
- 변수선언: 배열에서 꺼낸 값을 저장할 변수이다.
- 배열 전체를 반복하고 싶을 때 사용한다.
- 인덱스를 알 필요가 없을 때 사용한다.




*/
