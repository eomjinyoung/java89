// 주제: java.lang 패키지
public class Exam011 {
  public static void main(String[] args) {
    int value = Math.abs(-200);
    System.out.print(value + "\n");

    // 1970.1.1 00:00:00 부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    long millis = System.currentTimeMillis();
    System.out.print(millis + "\n");
  }
}

/*
=> java.lang 패키지의 클래스에 대해서는 예외적으로
   패키지명을 적지않고 클래스를 지정할 수 있다.








*/
