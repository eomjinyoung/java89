import java.util.ArrayList;
import java.util.Scanner;

public class StudentSelector2 {
  public static void main(String[] args) throws Exception {
    
    String[] students = {
      "김재녕", "유신애", "정지연", "한옥주", "신종우", "김건우", 
      "김보라", "박수희", "민경기", "김지환", "서동훈", "정선교", "원요엘", 
      "이석환", "김용진", "지정훈", "정용창", "한동은", "이성복",
      "천지연", "김희경", "김우종", "하세훈", "오용석", "남경훈"
    };
    
    /*
    String[] students = {
        "김재녕", "신종우", "이성복", "정용창", "유신애", "한옥주"
      };
    */
    /*
    String[] students = {
        "김건우", "김우종", "오용석", "정지연", "천지연", "김용진"
      };
    */
    /*
    String[] students = {
        "김보라", "박수희", "민경기", "김지환", "서동훈", "정선교", "원요엘", 
        "이석환", "지정훈", "한동은", 
        "김희경", "하세훈", "남경훈"
      };
      */
    ArrayList<String> list = new ArrayList<>();
    for (String name : students) {
      list.add(name);
    }
    
    Scanner keyScan = new Scanner(System.in);
    while (list.size() > 0) {
      int count = (int)(Math.random() * list.size());
      int no = 0;
      while (count-- > 0) {
        no = (int)(Math.random() * list.size());
        System.out.print(".");
        Thread.currentThread().sleep(300);
      }
      System.out.println(list.remove(no));
      keyScan.nextLine();
    }

  }
}
