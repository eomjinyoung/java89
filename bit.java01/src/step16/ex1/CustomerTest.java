/* 주제: 인스턴스 변수에 직접 접근했을 때 발생되는 문제
*/
package step16.ex1;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.name = "홍길동";
    customer.age = 300; // 직접 변수에 접근하여 값을 넣으면 문제 발생
                        // Customer를 정의할 때 고려되었던 
                        // 유효한 값이 아닌 무효한 값을 넣을 수 있다.
                        // Customer 클래스 정의(추상화)를 무너뜨리는 문제가 발생한다. 
    customer.gender = false;

    System.out.printf("이름: %s, 나이: %d, 성별(여:true,남:false): %b\n", 
      customer.name, customer.age, customer.gender);
  }

}