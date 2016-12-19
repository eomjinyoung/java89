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
|산술연산자| (), *, /, +, - 등|
|비교연산자| =, <>, !=, <, <=, >, >= 등|
|논리연산자| NOT, OR, AND 등|
|SQL 연산자| IN, BETWEEN, IS NULL, LIKE 등|
|집합연산자| UNION ALL, UNION 등| 

### 산술 연산자 사용하기
예: 강의명과 강의료, 수수료(강의료의 30%)를 조회하라.
~~~~
select titl, pric, pric * 0.3 'susu'
from lect;
~~~~

### 비교 연산자 사용하기
예: 2017년 2월에서 3월까지 개설되는 강의의 이름과 시작일, 종료일을 조회하라.
~~~~
select titl, sdt, edt
from lect
where sdt >= '2017-02-01' and sdt < '2017-04-01';
~~~~

### SQL 연산자 사용하기
#### in 연산자
예: '강남301', '강남303', '강남401', '강남402', '강남403' 강의실이 배정된 
    모든 강의를(강의번호, 강의명) 조회하라.
~~~~
select lno, titl
from lect
where crmno=1 or crmno=2 or crmno=3 or crmno=4 or crmno=5;

-- 여러 값 중에 하나에 해당되는 지 검사하는 편리한 연산자 'in'
select lno, titl
from lect
where crmno in (1, 2, 3, 4, 5);

-- not 연산자를 사용하면 in의 반대 조건을 만들 수 있다.
select lno, titl
from lect
where crmno not in (1, 2, 3, 4, 5);
~~~~ 

#### between ... and ... 연산자
예: 2017년 2월에서 3월까지 개설되는 강의의 이름과 시작일, 종료일을 조회하라.
~~~~
select titl, sdt, edt
from lect
where sdt between '2017-02-01' and '2017-03-31';
~~~~

예: '강남301', '강남303', '강남401', '강남402', '강남403' 강의실이 배정된 
    모든 강의를(강의번호, 강의명) 조회하라.
~~~~
select lno, titl
from lect
where crmno between 1 and 5;

select lno, titl 
from lect
where crmno not between 1 and 5;
~~~~    

#### null 조회
예: 트위터가 없는 강사(강사번호, 홈페이지)를 조회하라.
~~~~
select tno, hmpg
from tcher
where twit is null;
~~~~

예: 페이스북이 있는 강사(강사번호, 트위터)를 조회하라.
~~~~
select tno, twit
from tcher
where fcbk is not null;
~~~~

#### like 연산자
예: 강남에 있는 강의실(강의실번호, 이름)을 조회하라.
~~~~
-- "%" 플래그는 0자 이상을 의미한다.
-- 강의실 이름이 강남으로 시작하는 것
select crmno, name 
from croom 
where name like '강남%'; 

-- 강의실 이름이 1로 끝나는 것
select crmno, name 
from croom 
where name like '%1'; 

-- 강의실 이름에 5를 포함하는 것
-- 모든 문자를 비교해야 하기 때문에 조회 속도가 가능 느리다. 주의해서 사용할 것.
-- 해당 글자를 포함하는지 모든 문자열을 검색해야 하기 때문에 
-- 비용(CPU,메모리,시간 사용)사이 많이 든다.
select crmno, name 
from croom 
where name like '%3%';

-- "_" 플래그는 한 개의 문자를 의미한다.
-- 강의실 이름이 "강남x02" 인 것을 조회
select crmno, name 
from croom 
where name like '강남_02';

-- 강의실 이름이 앞의 두 글자는 아무거나, 세 번째는 3, 나머지는 0자이상 
select crmno, name 
from croom 
where name like '__3%';
~~~~

### 집합 연산자
#### union all
- 두 개의 select 결과를 그대로 합칠 때 유용하다.

예: 매니저 회원번호와 강사 회원번호를 조회하라.
~~~~
select mrno
from mgr
union all
select tno
from tcher;
~~~~ 

#### union
- 두 개의 select 결과를 합친다. 다만 중복 데이터는 제거하여 한 개만 남긴다.

예: 매니저 회원번호와 강사 회원번호를 조회하라.
~~~~
select mrno
from mgr
union
select tno
from tcher;
~~~~

#### minus 기능 구현
- MySQL은 집합에서 다른 집합의 데이터를 빼는 연산자가 없다.
- 다른 연산자를 조합하여 처리하라!

예: 강사를 겸하지 않는 매니저를 조회하라.
~~~~
select mrno
from mgr
where mrno not in (select tno from tcher);
~~~~

#### intersect(교집합) 기능 구현
- MySQL은 교집합을 구하는 연산자가 없다.
- 다른 연산자를 조합하여 처리하라!

예: 강사와 매니저를 겸하는 회원을 조회하라.
~~~~
select mrno
from mgr
where mrno in (select tno from tcher);
~~~~

### MySQL 빌트인 함수/프로시저 
#### count(* 또는 컬럼명) : 레코드 개수를 알아내기
~~~~
select count(*) from stud;
~~~~

#### concat(값, 값, 값, ...) : 문자열 연결하기
~~~~
select concat(mno, ',', name, '(', email, ')') as user
from memb;
~~~~

#### format(값, 소수점이하자릿수, 국가코드) : 숫자를 고정 소수점으로 표현
~~~~
select format(1234567.7654321, 3);
~~~~

#### to_base64(문자열) : 문자열을 BASE64 인코딩 하여 리턴한다. 
- BASE64? 문자열을 ASCII 코드화시키는 것. 
- 보통 네트워킹으로 다른 장치에게 값을 보낼 때 사용한다.
- 왜? 네트워크 장비 중에서는 7비트까지만 처리하는 장비가 있기 때문이다.
- 즉 8비트를 처리하지 못하는 장비가 있다. 이런 경우 7비트를 사용하는 ASCII로 인코딩 한다면,
  문제없이 데이터를 전달할 수 있다.
~~~~
select to_base64('ABCabc012가각간'); 
~~~~ 

#### from_base64(base64로 인코딩 된 문자열) : 원래의 문자열로 디코딩하여 리턴한다.
~~~~
select from_base64('QUJDYWJjMDEy6rCA6rCB6rCE');
~~~~

#### strcmp(문자열1, 문자열2) : 두 문자열을 비교하여 같으면 0, 왼쪽이 크면 1, 그 밖에 -1
~~~~
select strcmp('ABC', 'ABC');
select strcmp('ABD', 'ABC');
select strcmp('ABC', 'ABD');
~~~~ 

#### trim() : 문자열 양쪽에 있는 공백 또는 특정 문자 제거
~~~~
-- trim(문자열) : 양쪽 공백 제거
select concat('[', trim('   abc def  '), ']');

-- trim(leading 앞쪽에서제거할문자 from 문자열);
select trim(leading 'k' from 'kkkabckkkk');

-- trim(trailing 뒤쪽에서제거할문자 from 문자열);
select trim(trailing 'k' from 'kkkabckkkk');

-- trim(both 양쪽에서제거할문자 from 문자열);
select trim(both 'k' from 'kkkabckkkk');
~~~~

#### curdate() : 현재 날짜 조회
~~~~
select curdate();
~~~~

#### curtime() : 현재 시간 조회
~~~~
select curtime();
~~~~

#### curtime() : 현재 시간 조회
~~~~
select curtime();
~~~~

#### current_timestamp(), now() : 현재 날짜와 시간 조회
~~~~
select current_timestamp();
select now();
~~~~

#### get_format(date/time, 옵션) : 날짜 출력 형식을 문자열로 뽑아내기
~~~~
select get_format(date, 'USA');
select get_format(date, 'ISO');
~~~~

#### date_format(날짜, 출력형식) : 날짜를 지정된 형식의 문자열로 변환하기
~~~~
select date_format(now(), '%m.%d.%Y');
select date_format(now(), '%m.%d.%y');
select date_format(now(), '%Y-%m-%d');
select date_format(now(), '%Y-%m-%d %h:%i:%s');
~~~~

















