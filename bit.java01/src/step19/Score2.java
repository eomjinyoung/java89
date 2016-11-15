/* 내용: 합계와 평균은 직렬화에서 제외한다.
 * => 인스턴스 변수 선언 앞에 transient를 붙이면,
 *    일시적으로 사용되는 값을 저장하는 변수로서 
 *    직렬화 데이터에 포함시키지 말라는 명령이다. 
 */
package step19;

import java.io.Serializable;

public class Score2 implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private String name;
  private int kor;
  private int eng;
  private int math;
  transient private int sum;
  transient private float average;
  
  public Score2() {
  }
  
  public Score2(String name, int kor, int eng, int math) {
    super();
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    
    this.compute();
  }

  @Override
  public String toString() {
    return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", average="
        + average + "]";
  }

  // 공개하는 이유?
  // 직렬화 데이터를 읽는 쪽에서 출력 데이터에 포함되지 않은 합계와 평균을 
  // 다시 계산할 수 있도록 하기 위함.
  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.average = this.sum / 3f;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getKor() {
    return kor;
  }
  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }
  public int getEng() {
    return eng;
  }
  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }
  public int getMath() {
    return math;
  }
  public void setMath(int math) {
    this.math = math;
    this.compute();
  }
  public int getSum() {
    return sum;
  }
  public float getAverage() {
    return average;
  }
}
