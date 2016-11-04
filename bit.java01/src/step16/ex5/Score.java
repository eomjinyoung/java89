/* 주제: 셋터/겟터와 프로퍼티 
=> 속성(attribute)란?
   - 인스턴스 변수(클래스 변수 포함)를 가리키는 용어다.
   - 예) Score 클래스의 경우,
         _name, _kor, _eng, _math, _sum, _average 가 속성이다.
=> 프로퍼티(property)란?
   - 셋터와 겟터를 가리키는 용어이다.
   - 프로퍼티 명은 메서드 이름에서 "set"과 "get", "is"를 제거하고
     남은 이름 중에서 첫 알파벳을 소문자로 한 이름이다.
     예) setName() --> "name", setFirstName() --> "firstName"
     예) Score 클래스의 경우,
     setKor()/getKor()    ---> "kor"      : read/write 프로퍼티
     setEng()/getEng()    ---> "eng"      : read/write 프로퍼티
     setMath()/getMath()  ---> "math"     : read/write 프로퍼티
     getSum()             ---> "sum"      : read only 프로퍼티
     getAverage()         ---> "average"  : read only 프로퍼티

=> 프로퍼티 명과 변수 명은 다를 수 있다.
*/
package step16.ex5;

public class Score {
  String _name;
  private int _kor;
  private int _eng;
  private int _math;
  private int _sum;
  private float _average;

  public Score(String name, int kor, int eng, int math) {
    this._name = name;
    this._kor = kor;
    this._eng = eng;
    this._math = math;
    this._sum = kor + eng + math;
    this._average = this._sum / 3.0f;
  }

  private void compute() {
    this._sum = this._kor + this._eng + this._math;
    this._average = this._sum / 3f;
  }

  public void setKor(int kor) {
    this._kor = kor;
    this.compute();
  }

  public void setEng(int eng) {
    this._eng = eng;
    this.compute();
  }

  public void setMath(int math) {
    this._math = math;
    this.compute();
  }

  public int getKor() {return this._kor;}
  public int getEng() {return this._eng;}
  public int getMath() {return this._math;}

  public int getSum() {
    return this._sum;
  }

  public float getAverage() {
    return this._average;
  }

}