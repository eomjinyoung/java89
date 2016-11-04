/* 주제: 접근 제한된 변수의 값을 설정하는 방법 => 공개된 메서드 호출
*/
package step16.ex2;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("홍길동");
    //customer.setAge(300);  // 값이 유효하지 않기 때문에 실행 오류 발생!
    customer.setAge(30); // OK!
    customer.setGender(false);

    System.out.printf("이름: %s, 나이: %d, 성별(여:true,남:false): %b\n", 
      customer.getName(), customer.getAge(), customer.getGender());
  }

}