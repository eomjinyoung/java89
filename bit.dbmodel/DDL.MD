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

### 컬럼의 타입
- SQL 표준 데이터 타입이 있고, DBMS 전용 데이터 타입이 있다. 
- DBMS를 고려해서 타입을 지정해야 한다.

### PK가 없는 테이블
Primary Key가 없으면 중복 데이터가 입력될 수 있다.
~~~~
create table test_table1 (
  uid varchar(10),
  pwd varchar(10)
);
~~~~

데이터 입력
~~~~
insert into test_table1 values('user01', '1111');
insert into test_table1 values('user01', '1111'); 
~~~~
- PK가 없으면 아이디가 중복 입력될 수 있다.
- uid 컬럼이 PK가 아니기 때문에 DBMS는 중복 검사를 하지 않는다.

데이터 입력 확인
~~~~
select * from test_table1;
~~~~

### PK가 있는 테이블
- Primary Key로 설정된 컬럼은 데이터를 중복하여 입력할 수 없다.
- 자동으로 not null로 설정된다.
~~~~
create table test_table2 (
  uid varchar(10) primary key,
  pwd varchar(10)
);
~~~~

데이터 입력
~~~~
insert into test_table2 values('user01', '1111');
insert into test_table2 values('user01', '1111'); 
~~~~
- uid 컬럼값이 중복되면 입력이 되지 않는다.
- DBMS는 PK 컬럼에 대해 중복 여부를 검사한다.

### PK를 설정하는 다양한 방법
컬럼을 선언할 때 primary key를 붙인다.
~~~~
create table test_table2 (
  uid varchar(10) primary key,
  pwd varchar(10)
);
~~~~

컬럼을 선언한 후에 제약조건을 설정할 때 primary key 컬럼을 지정할 수 있다.
~~~~
create table test_table3 (
  uid varchar(10),
  pwd varchar(10),
  constraint primary key (uid)
);
~~~~

테이블을 생성한 후 제약조건을 설정할 때 primary key 컬럼을 지정할 수 있다.
~~~~
문법:
alter table 테이블명 
  add constraint [제약조건라벨] primary key (컬럼명, 컬럼명, ...);

예:   
create table test_table4 (
  uid varchar(10),
  pwd varchar(10)
);

alter table test_table4
  add constraint primary key (uid);

~~~~


## 테이블 삭제
~~~~
> drop table 테이블명;

예)
> drop table test_table1;

~~~~

## 테이블 정보 조회
~~~~ 
> describe 테이블명;

또는

> desc 테이블명;

~~~~

## 테이블 목록 조회
MySQL 전용 명령
~~~~
> show tables;

~~~~










