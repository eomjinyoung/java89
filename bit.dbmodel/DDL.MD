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

테이블을 생성한 후 제약조건을 추가하여 primary key 컬럼을 지정할 수 있다.
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

### not null 여부 지정하기
not null을 선언하지 않으면 기본이 null 허용이다. not null로 설정된 컬럼은 데이터 입력 시
반드시 값을 넣어야 한다.
~~~~
create table test_table5 (
  uid varchar(10) not null,
  pwd varchar(10) not null
);

insert into test_table5(uid) values('user01');
=> 암호는 not null이기 때문에 입력 오류이다.
~~~~

### default 값 지정하기
데이터를 입력할 때 값을 지정하지 않으면, default로 설정된 값을 사용한다.
~~~~
create table test_table6 (
  uid varchar(10) not null,
  pwd varchar(10) not null default '1111'
);

insert into test_table6(uid) values('user01');
=> 암호는 not null이다. 그러나 값을 입력하지 않으면, 기본 값 '1111'이 사용되기 때문에
   입력 오류가 발생하지 않는다.
   
create table test_table7 (
  uid varchar(10) not null,
  pwd varchar(10) default '1111' not null 
);
=> not null 옵션과 default 옵션의 순서를 바꿀 수 있다.
~~~~

## 테이블 변경
테이블을 생성한 후 컬럼을 추가, 변경, 삭제할 수 있다.

### 컬럼 추가
문법:
~~~~
alter table 테이블명
  add [column] 컬럼명 옵션;
~~~~

예:
~~~~
create table test_table8 (
  c1 int
);

alter table test_table8
  add c2 varchar(10) not null;
~~~~

### 컬럼 삭제
문법:
~~~~
alter table 테이블명
  drop [column] 컬럼명;
~~~~

예:
~~~~
alter table test_table8
  drop c1;
~~~~

### 컬럼 변경
문법1: 기존 컬럼의 정의를 변경한다.
~~~~
alter table 테이블명
  modify [column] 컬럼명 옵션;
  
컬럼 이름도 바꾸고 싶다면
alter table 테이블명
 change 현재컬럼명 변경이름 옵션;  
~~~~

예:
~~~~
alter table test_table8
  modify c2 int;

alter table test_table8
  change c2 ok date not null;
~~~~

### 유니크 컬럼 추가
문법:
~~~~
alter table 테이블명
  add [constraint [라벨명]] unique (컬럼명, 컬럼명, ...);
~~~~

예:
~~~~
create table test_table9(
  uno int not null,
  name varchar(20) not null,
  email varchar(50) not null,
  uid varchar(50) not null,
  pwd varchar(20) not null
);

alter table test_table9
  add unique (email);

alter table test_table9
  add unique (uid);   

alter table test_table9
  add primary key (uno);
~~~~

### Primary Key 제약조건 제거
문법:
~~~~
alter table 테이블명
  drop primary key; 
~~~~

예:
~~~~
alter table test_table9
  drop primary key;
~~~~

### 유니크 제약 조건 삭제하기
문법:
~~~~
alter table 테이블명
  drop 인덱스명; 
~~~~

예:
~~~~
인덱스(유니크 또는 일반 인덱스) 이름을 모른다면 
다음 SQL 문을 이용하여 해당 테이블의 인덱스 이름을 알아내라.

select table_name, index_name, column_name from information_schema.statistics 
where table_name='test_table9';

또는

show index from test_table9;

'email' 인덱스 삭제
alter table test_table9
  drop index email;

'uid' 인덱스 삭제
alter table test_table9
  drop index uid;  
~~~~

### PK 컬럼의 값이 자동 증가하도록 만들기
PK 컬럼에 auto_increment 옵션을 붙인다.

테이블을 정의할 때 컬럼 선언에 붙이기
~~~~
create table test_table10(
  uno int primary key not null auto_increment,
  name varchar(20) not null,
  email varchar(50) not null,
  uid varchar(50) not null,
  pwd varchar(20) not null
);
~~~~

테이블을 정의한 후 auto_increment 붙이기
~~~~
create table test_table11(
  uno int not null,
  name varchar(20) not null,
  email varchar(50) not null,
  uid varchar(50) not null,
  pwd varchar(20) not null
);

alter table test_table11
  add primary key (uno);
  
alter table test_table11
  modify uno int not null auto_increment;
  
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

> show tables from 스키마이름(=데이터베이스이름);
~~~~










