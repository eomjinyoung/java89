# DML(Data Manipulation Language)
- SQL 문법 중에서 데이터를 입력/변경/삭제할 때 사용하는 문법
- 실습할 때는 model.sql 로 생성한 테이블을 사용한다.

## 데이터 입력하기
### 모든 컬럼의 값을 입력하기
문법:
~~~~
insert into 테이블명 values(값, 값, 값, ...);
-- 값: 문자열인 경우 값 양쪽에 작은 따옴표를 붙인다. 예) '값'
-- 값을 넣는 순서는 테이블에서 컬럼을 선언한 순서와 같아야 한다.
~~~~

예:   
~~~~
-- 강의실 데이터 입력
insert into croom values(100, '강남301호');
insert into croom values(101, '강남303호');
~~~~

### 특정 컬럼의 값만 입력하기
문법:
~~~~
insert into 테이블명(컬럼명, 컬럼명, ...) values(값, 값, 값, ...);
-- 값: 문자열인 경우 값 양쪽에 작은 따옴표를 붙인다. 예) '값'
-- 값을 넣는 순서는 컬럼명을 나열한 순서와 같다. 
~~~~

예:   
~~~~
-- 강의실 데이터 입력
insert into croom(name) values('강남401호');
insert into croom(name) values('강남402호');
insert into croom(name) values('강남403호');

-- 회원 데이터 입력
insert into memb(email,pwd,name,tel) values('user01@test.com','1111','홍길동','1111-1111');
insert into memb(email,pwd,name,tel) values('user02@test.com','1111','홍길동2','1111-1112');
insert into memb(email,pwd,name,tel) values('user03@test.com','1111','홍길동3','1111-1113');

-- 'email' 컬럼은 유니크이기 때문에 중복 값을 넣을 수 없다.
insert into memb(email,pwd,name,tel) values('user03@test.com','1111','홍길동4','1111-1114'); -- 오류!
~~~~

### 자식 테이블의 값 입력
- 반드시 부모 테이블에 존재하는 PK 값이어야 한다.
예:
~~~~
-- 매니저 데이터 입력
insert into mgr(mrno, posi, path) values(1, '대리', 'hong.gif'); -- 홍길동
insert into mgr(mrno, posi, path) values(100, '대리', 'hong.gif'); -- 오류! 존재하지 않는 PK.

-- 강사 데이터 입력 
insert into tcher(tno,hmpg,fcbk,twit) 
values(2, 'http://www.hong2.com', 'http://www.facebook.com/hong', null); -- 홍길동2

-- 학생 데이터 입력
insert into stud(sno,work,lst_schl) 
values(3, 'Y', '학사'); -- 홍길동3
~~~~

## 데이터 변경하기
문법:
~~~~
update 테이블명 set 컬럼명=값, 컬럼명=값, ... where 조건;
~~~~

예:
~~~~
-- 회원 데이터 이름 변경
update memb set name='임꺽정' where mno=2; -- 홍길동2 > 임꺽정

-- 모든 사용자의 암호를 '0000'으로 초기화 시킨다.
update memb set pwd='0000'; -- 조건이 없으면 모든 데이터에 변경을 적용한다.

-- 암호는 입력 값 그대로 저장하면 안되고 반드시 암호화시켜서 저장해야 한다.
-- MySQL DBMS에게 제공해주는 password() 함수를 사용하라!
update memb set pwd=password('0000');

-- 사용자 인증 
select * from memb where email='user01@test.com' and pwd=password('0000');
~~~~
















