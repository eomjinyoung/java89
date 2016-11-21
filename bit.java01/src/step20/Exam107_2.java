/* 주제: 스레드 프로그래밍 - 크리티컬 섹션(critical section)과 동기화 II
 * - Critical Section에 뮤텍스를 적용하려면 
 *   synchronized 키워드를 붙여라!
 *   메서드 선언부에 붙일 수 있고, 블록에 붙일 수도 있다.
 */
package step20;

public class Exam107_2 { 
  static class Account {
    long balance;
    
    public Account(long balance) {
      this.balance = balance;
    }
    
    // synchronized 키워드가 붙은 블록은 한 번에 한 스레드만이 진입할 수 있다.
    // 즉 뮤텍스가 적용된다.
    // => 이 방식의 단점은 한 번에 한 스레드 만이 진입할 수 있기 때문에
    //    동시 처리의 장점인 처리 속도를 높일 수 없다.
    // => 그러나 값이 동기화되는 것이 중요하다면 속도를 낮추더라도
    //    이런 방식으로 처리해야 한다.
    synchronized public long withdraw(long money) {
      long temp = this.balance;
      
      temp -= money;
      
      if (temp < 0) {
        return 0;
      }
      
      this.balance = temp;
      return money;
    }
    
  }
  
  static class ATM extends Thread {
    Account account;
    
    public ATM(String name) {
      super(name);
    }

    public void setAccount(Account account) {
      this.account = account;
    }
    
    @Override
    public void run() {
      long sum = 0;
      
      while (true) {
        long money = 100;
        long result = account.withdraw(money);
        if (result == 0) {
          break;
        }
        sum += result;
      }
      
      System.out.printf("%s: %d\n", this.getName(), sum);
    }
  }
  
  public static void main(String[] args) throws Exception {
    Account account = new Account(1000000);
    
    ATM t1 = new ATM("강남");
    t1.setAccount(account);
    ATM t2 = new ATM("서초");
    t2.setAccount(account);
    ATM t3 = new ATM("부산");
    t3.setAccount(account);
    ATM t4 = new ATM("광주");
    t4.setAccount(account);
    ATM t5 = new ATM("제주");
    t5.setAccount(account);
    ATM t6 = new ATM("사북");
    t6.setAccount(account);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    
  }
}

/* 세마포어(Semaphore)
 * - 크리티컬 섹션에 동시 진입할 수 있는 스레드의 개수를 제한하는 기법을 말한다.
 * - Semaphore(4) => 동시에 4개까지 진입할 수 있다.
 * - 예) 화장실 
 * 
 * 뮤텍스(Mutex; MUTual EXclusion)
 * - 크리티컬 섹션에 오직 한 개의 스레드만이 집입할 수 있는 것.
 * - Mutex == Semaphore(1)
 * - 예) 화장실의 좌변기 
 * - 자바의 동기화는 뮤텍스 방식으로 동작한다.
 */











