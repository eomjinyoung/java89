// 주제: 변수 선언 - 변수를 선언하는 다양한 방법
package step03;

public class Exam033_0 {
  public static void main(String[] args) {
    //1) 낱개로 변수를 선언하기
    int kor;
    int eng;
    int math;

    //2) 같은 종류의 변수는 묶어서 선언할 수 있다.
    int age, weight, height;

    //3) 같은 종류의 변수는 한 가지 이름으로 여러 개 선언할 수 있다.
    //int scores[3]; //안타깝게도 자바는 이 문법을 지원하지 않는다. C언어에서 가능!
    int[] scores = new int[3]; //<--- "array(배열)"이라 부른다.
    int scores2[] = new int[3]; //자바는 int[] 변수명; 을 더 많이 사용한다.
  }
}

/*







*/
