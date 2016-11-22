/* 주제: 스레드 프로그래밍 - 스레드 동기화
 * - 동기화는 항상 객체에 대해 제어된다.
 *   즉 같은 객체에 대해서는 여러 개의 synchronized 메서드 중에서
 *   한 스레드의 진입만 허용한다.
 *   
 */
package step20;

public class Exam108_0 {
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
    Account account = new Account();
    ATM t1 = new ATM(account, ATM.WITHDRAW);
    ATM t2 = new ATM(account, ATM.DEPOSIT);
    
    t1.start();
    t2.start();
    
  }
}












