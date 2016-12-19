# DQL(Data Query Language) 2
SQL 문법 중에서 데이터를 조회할 때 사용하는 문법2

## group by 와 having 
- 특정 컬럼으로 데이터를 묶어 조회할 때 사용

예: 각 강사가 강의한 과목의 개수를 조회하기
~~~~
select tno, count(lno), max(lno), min(lno), sum(lno)
from tchr_lect
group by tno;
~~~~

예: 3과목 이상을 강의하는 강사를 조회하기
~~~~
-- group by의 조건을 지정할 때 where가 아닌 having을 써야한다.
select tno, count(lno)
from tchr_lect
group by tno
having count(lno) >= 3;
~~~~

예: 2과목 이하를 강의하는 강사를 조회하기
~~~~
select tno, count(lno)
from tchr_lect
group by tno
having count(lno) <= 2;
~~~~


## 조인
- 테이블과 테이블을 연결하여 데이터를 조회하는 문법

### CROSS(cartesian) 조인
- 두 테이블의 데이터를 모두 연결한다.
- 의미없는 조인이다. t1 x t2, 즉 곱하기 조인이다.

예: 학생정보(학생번호,이름,이메일,재직여부,최종학력)를 출력하라.
~~~~
-- 예전 문법
select mno, name, email, work, lst_schl
from memb, stud;

-- 신규 문법
select mno, name, email, work, lst_schl
from memb cross join stud;
~~~~

### NATURAL 조인
- 특정 컬럼(자식 테이블의 FK와 부모 테이블의 PK)을 기준으로 두 테이블의 데이터를 연결한다.

예: 학생정보(학생번호,이름,이메일,재직여부,최종학력)를 출력하라.
~~~~
-- 예전 문법
select mno, name, email, work, lst_schl
from memb t1, stud t2
where t1.mno=t2.sno;

-- 신규 문법
-- 두 테이블의 컬럼 중에서 이름이 같은 컬럼을 FK와 PK로 보고 연결한다.
-- 만약 두 테이블에 이름이 같은 컬럼이 없다면 그냥 cross 조인을 수행한다.
-- memb와 stud에는 이름이 같은 컬럼이 없기 때문에 그냥 cross 조인을 수행할 것이다.
select mno, name, email, work, lst_schl
from memb natural join stud;
~~~~

예: 강의실 정보(강의번호,강의명,강의실명)를 출력하라!
~~~~
-- 예전 문법
select lno, titl, name
from lect t1, croom t2
where t1.crmno=t2.crmno;

-- 신규 문법
-- lect와 croom 사이에 공통 컬럼이 있기 때문에 그 컬럼을 기준으로 데이터들을 연결한다.
select lno, titl, name
from lect natural join croom;
~~~~

### JOIN ~ USING() 조인
- 두 테이블에 같은 이름을 가진 컬럼이 여러 개 있을 경우, 
  조인할 때 사용할 컬럼을 지정하는 문법.

예: 강의 정보(강의번호,강의명,강의실명)를 출력하라!
~~~~
-- 신규 문법
-- lect와 croom 테이블에 이름이 같은 컬럼이 여러 개 있을지라도,
-- 오직 crmno 컬럼의 값이 같은 데이터 끼리만 연결한다.
select lno, titl, name
from lect join croom using(crmno);
~~~~

예: 학생정보(학생번호,이름,이메일,재직여부,최종학력)를 출력하라.
~~~~
-- 두 테이블의 데이터를 연결할 때 사용할 컬럼 이름이 일치하지 않기 때문에 실행 오류 발생! 
select mno, name, email, work, lst_schl
from memb join stud using(mno);
~~~~

### JOIN ~ ON 조인
- 두 테이블의 데이터를 연결할 때 사용할 컬럼 이름이 일치하지 않을 때 사용하는 문법.

예: 학생정보(학생번호,이름,이메일,재직여부,최종학력)를 출력하라.
~~~~
-- 두 테이블의 데이터를 연결할 때 사용할 컬럼 이름이 일치하지 않기 때문에 실행 오류 발생! 
select mno, name, email, work, lst_schl
from memb join stud on memb.mno=stud.sno;
~~~~

### OUTER JOIN ~ ON 조인
- 두 테이블의 데이터 중에서 값이 일치하는 경우가 없다 하더라도 조회 결과에 포함시키는 방법

예: 강의 정보(강의번호,강의명,강의실명)를 출력하라!
~~~~
-- 모든 강의 목록 조회
select lno, titl, crmno
from lect;

-- 강의 정보에 강의실 이름을 출력하기
-- crmno가 없는 강의인 경우 결과에 포함되지 않는 문제가 발생한다.
select lno, titl, lect.crmno, name
from lect join croom on lect.crmno=croom.crmno;

-- 강의실이 배정되지 않은 강의도 결과에 포함시키기
-- 왼쪽 테이블을 중심으로 오른쪽 테이블의 데이터를 연결한다.
-- 왼쪽 테이블의 데이터는 무조건 모두 출력한다.
select lno, titl, lect.crmno, name
from lect left outer join croom on lect.crmno=croom.crmno;

-- 강의실을 중심으로 왼쪽 테이블의 데이터를 연결할 때.
-- 강의가 배정되지 않은 강의실을 포함해서 모든 강의실 데이터를 출력한다.
select lno, titl, lect.crmno, name
from lect right outer join croom on lect.crmno=croom.crmno;

-- [오라클에서는 지원, MySQL은 지원하지 않음]
-- 두 테이블의 데이터 중에서 서로 연결되지 않은 데이터도 결과에 포함하고 싶다면,
-- 양쪽 모두 outer로 연결하라
select lno, titl, lect.crmno, name
from lect full outer join croom on lect.crmno=croom.crmno;
~~~~

예: 수강신청 정보를 조회하라.
(수강신청번호, 강의명, 강의실명, 매니저명, 매니저직책, 수강생명, 이메일, 재직여부) 
~~~~
select lano, lno, sno 
from lect_appy;

select lano, titl, sno
from lect_appy
	 left outer join lect on lect_appy.lno=lect.lno; 

select lano, titl, name
from lect_appy
	 left outer join lect on lect_appy.lno=lect.lno
	 left outer join memb on lect_appy.sno=memb.mno;

select lano, titl, sdt, edt, name
from lect_appy
	 left outer join lect on lect_appy.lno=lect.lno
	 left outer join memb on lect_appy.sno=memb.mno;	 
	 
select lano, titl, sdt, edt, name, name
from lect_appy
	 left outer join lect on lect_appy.lno=lect.lno
	 left outer join memb on lect_appy.sno=memb.mno;		 
	 
select lano, titl, sdt, edt, croom.name, m2.name, mgr.posi, memb.name, memb.email
from lect_appy
	 left outer join lect on lect_appy.lno=lect.lno
	 left outer join memb on lect_appy.sno=memb.mno
	 left outer join croom on lect.crmno=croom.crmno	
	 left outer join memb m2 on lect.mrno=m2.mno
	 left outer join mgr on lect.mrno=mgr.mrno;

select 
	lano,  			-- 수강신청번호
	titl, 			-- 강의명
	sdt, 			-- 강의시작일
	croom.name, 	-- 강의실명
	m2.name, 		-- 매니저명
	mgr.posi, 		-- 매지저 직위
	memb.name, 		-- 학생명
	memb.email, 	-- 학생이메일
	stud.work		-- 학생 재직여부 
from lect_appy
	 left outer join lect on lect_appy.lno=lect.lno
	 left outer join memb on lect_appy.sno=memb.mno
	 left outer join croom on lect.crmno=croom.crmno	
	 left outer join memb m2 on lect.mrno=m2.mno
	 left outer join mgr on lect.mrno=mgr.mrno
	 left outer join stud on lect_appy.sno=stud.sno;	 
~~~~

## 서브 쿼리
-- 쿼리문 안에 또 다른 쿼리문을 넣는 문법
-- select, from, where 절에 넣을 수 있다.

예: 수강신청 정보를 조회하라.
(수강신청번호, 강의명, 강의실명, 매니저명, 매니저직책, 수강생명, 이메일, 재직여부) 
~~~~
select lano, lno, sno 
from lect_appy;

-- select 문에 서브쿼리 넣기
-- 컬럼 자리에 서브쿼리를 넣을 때는 반드시 결과가 한 개 이하여야 한다.
select 
	lano, 
	(select titl from lect where lect.lno=lect_appy.lno) 'lecture title', 
	sno 
from lect_appy;

select 
	lano, 
	(select titl from lect where lect.lno=lect_appy.lno) 'lecture title', 
	(select sdt from lect where lect.lno=lect_appy.lno) 'start date', 
	(select name from memb where memb.mno=lect_appy.sno) 'student name' 
from lect_appy;
~~~~

### from 절에 서브쿼리 넣기

예: 강의실이 배정되지 않은 수강신청 정보를 모두 뽑아라.
~~~~
-- 서브쿼리를 사용하지 않은 예
select lano, titl, lect.crmno
from lect_appy
     left outer join lect on lect_appy.lno=lect.lno
where lect.crmno is null;

-- 서브쿼리를 사용하는 예
-- 서브쿼리를 사용하여 가상 테이블을 만들 수 있다.
select lano, titl, t1.crmno
from lect_appy
     join (select lno, titl, crmno from lect where crmno is null) t1 
       on lect_appy.lno=t1.lno;
~~~~ 

### where에 서브쿼리 넣기

예: 강의실이 배정되지 않은 강의에 대해서만 수강 신청 번호와 강의 번호, 학생 번호를 출력하라!
~~~~
select lano, lno, sno, memb.name
from lect_appy
     left outer join memb on lect_appy.sno=memb.mno
where lno in (select lno from lect where crmno is null);
~~~~

















