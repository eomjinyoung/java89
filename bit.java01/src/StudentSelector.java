public class StudentSelector {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "민경기", "김지환", "서동훈", "정선교", "김보라", "박수희",
      "김우종", "하세훈", "오용석", "남경훈", "김재녕", "유신애", 
      "정지연", "한옥주", "신종우", "김건우", "이석환", "김용진",  
      "지정훈", "정용창", "한동은", "이성복", "원요엘",
      "천지연", "김희경"
    };
  
    int count = (int)(Math.random() * students.length);
    int no = 0;
    while (count-- > 0) {
      no = (int)(Math.random() * students.length);
      System.out.print(".");
      Thread.currentThread().sleep(300);
    }

    System.out.println(students[no]);

  }
}
