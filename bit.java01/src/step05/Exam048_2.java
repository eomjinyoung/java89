// 주제: 명령어 흐름 제어 - 반복문 while과 break

package step05;

public class Exam048_2 {
  public static void main(String[] args) {
    int stopNo = Integer.parseInt(args[0]);

    int count = 0;
    while (true) {
      if (count > stopNo)
        break;
      System.out.printf("%d: 하하하\n", count++);
    }

  }
}

/*
# while + break
- while 블록 안에서 break를 사용하면 즉시 반복을 멈추고 while 블록을 나간다.





*/
