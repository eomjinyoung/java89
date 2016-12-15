# DDL(Data Definition Language)
SQL 문법 중에서 데이터 구조를 정의할 때 사용하는 문법

## 테이블 만들기
~~~~
create table 테이블명 (
  컬럼명 타입 옵션,
  컬럼명 타입 옵션, 
  ...
);

예)
create table test_table1(
  c1 int,
  c2 varchar(10),
  c3 char(10),
  c4 date,
  c5 datetime
);
~~~~

## 테이블 정보 조회
~~~~ 
> describe 테이블명;

또는

> desc 테이블명;

~~~~











