// 주제: 연산자 - 전위(pre) 연산자와 후위(post) 연산자의 차이점
package step04;

public class Exam037_2 {
  public static void main(String[] args) {
    //1) 전위 연산자 사용
    int a = 10;
    System.out.println(++a);
    System.out.println(a);

    //2) 후위 연산자 사용
    int b = 10;
    System.out.println(b++);
    System.out.println(b);

  }
}

/*
# 전위 연산자와 후위 연산의 동작 방법
++a
=> a 메모리의 값을 먼저 증가시킨 다음에 그 자리에 a 메모리 값을 둔다.
   주의! 메모리를 두는 게 아니라 값을 둔다!

a++
=> a 메모리의 값을 그 자리에 먼저 둔 다음에, a 메모리의 값을 증가한다.
   주의! 메모리를 두는 게 아니라 값을 둔다!











*/
