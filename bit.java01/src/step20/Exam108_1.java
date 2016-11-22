/* 주제: 스레드 프로그래밍 - 스레드 동기화
 * - 만약 스레드가 사용하는 객체가 다르다면,
 *   동시에 여러 synchronized 메서드에 진입할 수 있다.
 *   즉 객체 별로 진입을 관리한다.
 */
package step20;

public class Exam108_1 {
  static class Account {
    synchronized public void withdraw() {
      try { 
        Thread.currentThread().sleep(5000);
      } catch (Exception e) {}
    }
    
    synchronized public void deposit() {
      try { 
        Thread.currentThread().sleep(5000);
      } catch (Exception e) {}
    }
  }
  static class ATM extends Thread {
    static int DEPOSIT = 0;
    static int WITHDRAW = 1;
    Account account;
    int type;
    
    public ATM(Account account, int type) {
      this.account = account;
      this.type = type;
    }
    
    @Override
    public void run() {
      if (this.type == WITHDRAW) {
        System.out.println("출금 준비");
        account.withdraw();
        System.out.println("출금 완료");
      } else {
        System.out.println("입금 준비");
        account.deposit();
        System.out.println("입금 준비");
      }
    }
  }
  
  
  
  public static void main(String[] args) throws Exception {
    Account account1 = new Account();
    Account account2 = new Account();
    ATM t1 = new ATM(account1, ATM.WITHDRAW);
    ATM t2 = new ATM(account2, ATM.DEPOSIT);
    
    t1.start();
    t2.start();
    
  }
}












