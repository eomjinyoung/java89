# DQL(Data Query Language)
SQL 문법 중에서 데이터를 조회할 때 사용하는 문법

## 조회 기본 문법 
기본 문법:
~~~~
select [distinct|all(기본)] 컬럼명, 컬럼명, ...
from 테이블명; 
~~~~ 

예:
~~~~
select all mno, name, email 
from memb;

-- all은 생략 가능
select mno, name, email 
from memb;

-- distinct 옵션 사용
select distinct mno, name, email 
from memb;
~~~~

### all과 distinct의 구분
예: 강의에 배정된 강의실 번호를 모두 뽑아라.
~~~~
-- 결과 데이터의 중복을 제거하지 않고 모두 뽑는다.
select all crmno 
from lect; 

-- 중복된 결과는 한 개만 뽑는다.
select distinct crmno 
from lect;

-- 중복된 결과를 한 개만 뽑고, 강의실이 배정되지 않은 것은 제외한다.
select distinct crmno 
from lect
where crmno is not null;
~~~~

### 결과를 정렬하기
문법:
~~~~
select 컬럼명, 컬럼명,...
from 테이블명
order by 컬럼명 [ASC(기본)|DESC], 컬럼명 [ASC(기본)|DESC], ...
~~~~

예:
~~~~
-- 이름을 오름차순으로 정렬하기
select mno, name, email
from memb
order by name asc;

-- 기본이 오름차순
select mno, name, email
from memb
order by name;

select mno, name, email
from memb
order by mno;

-- 이름을 내림차순으로 정렬하기
select mno, name, email
from memb
order by name desc;

select mno, name, email
from memb
order by mno desc;

-- 컬럼을 선택한 다음에 정렬하는 것이 아니라 정렬한 다음에 컬럼을 선택하는 것이다.
-- 명령어 실행 순서: from ---> order by ---> select
select name
from memb
order by mno desc;

-- 수강신청 정보를 출력한다. 강의번호는 내림차순으로, 학생번호는 오름차순으로 정렬하라!
-- 출력할 값: 수강신청번호, 강의번호, 학생번호
select lano, lno, sno
from lect_appy
order by lno desc, sno asc;
~~~~

### 컬럼에 별명 부여하기
문법:
~~~~
select 
  컬럼명 [as] 별명, 
  컬럼명 [as] '별명',
  컬럼명 [as] "별명",
   ...
from 테이블명;
~~~~

예: 수강 신청 정보를 출력하라. 출력내용은 수강신청번호, 강의번호, 학생번호, 신청일 이다.
~~~~
-- 출력할 때 컬럼의 헤더 이름: apply no, lecture no, studentNo, register_date
select
  lano as "apply no",
  lno as 'lecture no',
  sno as studentNo,
  rdt register_date
from lect_appy;
~~~~


### 조회 조건 지정하기
문법:
~~~~
select ...
from ...
where 조건1 조건2 조건3
~~~~

예: 강의료가 100만원 이하인 강의를 조회하라!
~~~~
-- 출력결과: 강의번호, 강의명, 시작일, 종료일, 모집인원
select lno, titl, sdt, edt, qty 
from lect
where pric <= 1000000;
~~~~

#### 주요 연산자
|연산자 종류| 연산자|
|-----------|-------|
|산술연산자| (), *, /, +, - |
|비교연산자| =, <>, !=, <, <=, >, >= 등|
|논리연산자| NOT, OR, AND |
|SQL 연산자| IN, BETWEEN, IS NULL, LIKE 등|
|집합연산자| UNION ALL, UNION 등| 














