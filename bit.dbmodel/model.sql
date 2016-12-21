-- 수강신청
DROP TABLE IF EXISTS LECT_APPY RESTRICT;

-- 강의
DROP TABLE IF EXISTS LECT RESTRICT;

-- 강사
DROP TABLE IF EXISTS TCHER RESTRICT;

-- 매니저
DROP TABLE IF EXISTS MGR RESTRICT;

-- 강의실
DROP TABLE IF EXISTS CROOM RESTRICT;

-- 학생
DROP TABLE IF EXISTS STUD RESTRICT;

-- 강의실사진
DROP TABLE IF EXISTS CROOM_PHOT RESTRICT;

-- 강사사진
DROP TABLE IF EXISTS TCH_PHOT RESTRICT;

-- 강사배정
DROP TABLE IF EXISTS TCHR_LECT RESTRICT;

-- 회원
DROP TABLE IF EXISTS MEMB RESTRICT;

-- 수강신청
CREATE TABLE LECT_APPY (
	LANO INTEGER  NOT NULL COMMENT '수강신청일련번호', -- 수강신청일련번호
	LNO  INTEGER  NOT NULL COMMENT '강의일련번호', -- 강의일련번호
	SNO  INTEGER  NOT NULL COMMENT '학생일련번호', -- 학생일련번호
	RDT  DATETIME NOT NULL COMMENT '신청일', -- 신청일
	STAT INTEGER  NULL     COMMENT '상태' -- 상태
)
COMMENT '수강신청';

-- 수강신청
ALTER TABLE LECT_APPY
	ADD CONSTRAINT PK_LECT_APPY -- 수강신청 Primary key
		PRIMARY KEY (
			LANO -- 수강신청일련번호
		);

-- 수강신청 Unique Index
CREATE UNIQUE INDEX UIX_LECT_APPY
	ON LECT_APPY ( -- 수강신청
		LNO ASC, -- 강의일련번호
		SNO ASC  -- 학생일련번호
	);

ALTER TABLE LECT_APPY
	MODIFY COLUMN LANO INTEGER NOT NULL AUTO_INCREMENT COMMENT '수강신청일련번호';

-- 강의
CREATE TABLE LECT (
	LNO   INTEGER      NOT NULL COMMENT '강의일련번호', -- 강의일련번호
	CRMNO INTEGER      NULL     COMMENT '강의실일련번호', -- 강의실일련번호
	MRNO  INTEGER      NULL     COMMENT '매니저일련번호', -- 매니저일련번호
	TITL  VARCHAR(255) NOT NULL COMMENT '제목', -- 제목
	DSCP  TEXT         NOT NULL COMMENT '설명', -- 설명
	SDT   DATE         NOT NULL COMMENT '시작일', -- 시작일
	EDT   DATE         NOT NULL COMMENT '종료일', -- 종료일
	QTY   INTEGER      NOT NULL COMMENT '수강가능인원', -- 수강가능인원
	PRIC  INTEGER      NULL     COMMENT '수업료', -- 수업료
	THRS  INTEGER      NOT NULL COMMENT '총시간' -- 총시간
)
COMMENT '강의';

-- 강의
ALTER TABLE LECT
	ADD CONSTRAINT PK_LECT -- 강의 Primary key
		PRIMARY KEY (
			LNO -- 강의일련번호
		);

-- 강의 Index
CREATE INDEX IX_LECT
	ON LECT( -- 강의
		TITL ASC -- 제목
	);

ALTER TABLE LECT
	MODIFY COLUMN LNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의일련번호';

-- 강사
CREATE TABLE TCHER (
	TNO  INTEGER      NOT NULL COMMENT '강사일련번호', -- 강사일련번호
	HMPG VARCHAR(255) NULL     COMMENT '홈페이지', -- 홈페이지
	FCBK VARCHAR(255) NULL     COMMENT '페이스북', -- 페이스북
	TWIT VARCHAR(255) NULL     COMMENT '트위터' -- 트위터
)
COMMENT '강사';

-- 강사
ALTER TABLE TCHER
	ADD CONSTRAINT PK_TCHER -- 강사 Primary key
		PRIMARY KEY (
			TNO -- 강사일련번호
		);

-- 매니저
CREATE TABLE MGR (
	MRNO INTEGER      NOT NULL COMMENT '매니저일련번호', -- 매니저일련번호
	POSI VARCHAR(100) NULL     COMMENT '직급', -- 직급
	FAX  VARCHAR(30)  NULL     COMMENT '팩스', -- 팩스
	PATH VARCHAR(255) NOT NULL COMMENT '사진파일경로' -- 사진파일경로
)
COMMENT '매니저';

-- 매니저
ALTER TABLE MGR
	ADD CONSTRAINT PK_MGR -- 매니저 Primary key
		PRIMARY KEY (
			MRNO -- 매니저일련번호
		);

-- 강의실
CREATE TABLE CROOM (
	CRMNO INTEGER      NOT NULL COMMENT '강의실일련번호', -- 강의실일련번호
	NAME  VARCHAR(100) NOT NULL COMMENT '이름' -- 이름
)
COMMENT '강의실';

-- 강의실
ALTER TABLE CROOM
	ADD CONSTRAINT PK_CROOM -- 강의실 Primary key
		PRIMARY KEY (
			CRMNO -- 강의실일련번호
		);

-- 강의실 Unique Index
CREATE UNIQUE INDEX UIX_CROOM
	ON CROOM ( -- 강의실
		NAME ASC -- 이름
	);

ALTER TABLE CROOM
	MODIFY COLUMN CRMNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의실일련번호';

-- 학생
CREATE TABLE STUD (
	SNO      INTEGER      NOT NULL COMMENT '학생일련번호', -- 학생일련번호
	WORK     CHAR(1)      NOT NULL COMMENT '재직여부', -- 재직여부
	LST_SCHL VARCHAR(100) NULL     COMMENT '최종학력', -- 최종학력
	SCHL_NM  VARCHAR(100) NULL     COMMENT '학교명', -- 학교명
	PST_NO   VARCHAR(10)  NULL     COMMENT '우편번호', -- 우편번호
	BAS_ADR  VARCHAR(255) NULL     COMMENT '기본주소', -- 기본주소
	DET_ADR  VARCHAR(255) NULL     COMMENT '상세주소', -- 상세주소
	PATH     VARCHAR(255) NULL     COMMENT '사진파일경로' -- 사진파일경로
)
COMMENT '학생';

-- 학생
ALTER TABLE STUD
	ADD CONSTRAINT PK_STUD -- 학생 Primary key
		PRIMARY KEY (
			SNO -- 학생일련번호
		);

-- 강의실사진
CREATE TABLE CROOM_PHOT (
	CPNO  INTEGER      NOT NULL COMMENT '강의실사진일련번호', -- 강의실사진일련번호
	CRMNO INTEGER      NOT NULL COMMENT '강의실일련번호', -- 강의실일련번호
	PATH  VARCHAR(255) NOT NULL COMMENT '파일경로' -- 파일경로
)
COMMENT '강의실사진';

-- 강의실사진
ALTER TABLE CROOM_PHOT
	ADD CONSTRAINT PK_CROOM_PHOT -- 강의실사진 Primary key
		PRIMARY KEY (
			CPNO -- 강의실사진일련번호
		);

ALTER TABLE CROOM_PHOT
	MODIFY COLUMN CPNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의실사진일련번호';

-- 강사사진
CREATE TABLE TCH_PHOT (
	TPNO INTEGER      NOT NULL COMMENT '강사사진일련번호', -- 강사사진일련번호
	TNO  INTEGER      NOT NULL COMMENT '강사일련번호', -- 강사일련번호
	PATH VARCHAR(255) NOT NULL COMMENT '파일경로' -- 파일경로
)
COMMENT '강사사진';

-- 강사사진
ALTER TABLE TCH_PHOT
	ADD CONSTRAINT PK_TCH_PHOT -- 강사사진 Primary key
		PRIMARY KEY (
			TPNO -- 강사사진일련번호
		);

ALTER TABLE TCH_PHOT
	MODIFY COLUMN TPNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '강사사진일련번호';

-- 강사배정
CREATE TABLE TCHR_LECT (
	LNO INTEGER NOT NULL COMMENT '강의일련번호', -- 강의일련번호
	TNO INTEGER NOT NULL COMMENT '강사일련번호' -- 강사일련번호
)
COMMENT '강사배정';

-- 강사배정
ALTER TABLE TCHR_LECT
	ADD CONSTRAINT PK_TCHR_LECT -- 강사배정 Primary key
		PRIMARY KEY (
			LNO, -- 강의일련번호
			TNO  -- 강사일련번호
		);

-- 회원
CREATE TABLE MEMB (
	MNO   INTEGER      NOT NULL COMMENT '회원일련번호', -- 회원일련번호
	NAME  VARCHAR(100) NOT NULL COMMENT '이름', -- 이름
	TEL   VARCHAR(30)  NOT NULL COMMENT '전화', -- 전화
	EMAIL VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
	PWD   VARCHAR(50)  NOT NULL COMMENT '암호' -- 암호
)
COMMENT '회원';

-- 회원
ALTER TABLE MEMB
	ADD CONSTRAINT PK_MEMB -- 회원 Primary key
		PRIMARY KEY (
			MNO -- 회원일련번호
		);

-- 회원 Unique Index
CREATE UNIQUE INDEX UIX_MEMB
	ON MEMB ( -- 회원
		EMAIL ASC -- 이메일
	);

-- 회원 Index
CREATE INDEX IX_MEMB
	ON MEMB( -- 회원
		NAME ASC -- 이름
	);

ALTER TABLE MEMB
	MODIFY COLUMN MNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원일련번호';

-- 수강신청
ALTER TABLE LECT_APPY
	ADD CONSTRAINT FK_LECT_TO_LECT_APPY -- 강의 -> 수강신청
		FOREIGN KEY (
			LNO -- 강의일련번호
		)
		REFERENCES LECT ( -- 강의
			LNO -- 강의일련번호
		);

-- 수강신청
ALTER TABLE LECT_APPY
	ADD CONSTRAINT FK_STUD_TO_LECT_APPY -- 학생 -> 수강신청
		FOREIGN KEY (
			SNO -- 학생일련번호
		)
		REFERENCES STUD ( -- 학생
			SNO -- 학생일련번호
		);

-- 강의
ALTER TABLE LECT
	ADD CONSTRAINT FK_MGR_TO_LECT -- 매니저 -> 강의
		FOREIGN KEY (
			MRNO -- 매니저일련번호
		)
		REFERENCES MGR ( -- 매니저
			MRNO -- 매니저일련번호
		);

-- 강의
ALTER TABLE LECT
	ADD CONSTRAINT FK_CROOM_TO_LECT -- 강의실 -> 강의
		FOREIGN KEY (
			CRMNO -- 강의실일련번호
		)
		REFERENCES CROOM ( -- 강의실
			CRMNO -- 강의실일련번호
		);

-- 강사
ALTER TABLE TCHER
	ADD CONSTRAINT FK_MEMB_TO_TCHER -- 회원 -> 강사
		FOREIGN KEY (
			TNO -- 강사일련번호
		)
		REFERENCES MEMB ( -- 회원
			MNO -- 회원일련번호
		);

-- 매니저
ALTER TABLE MGR
	ADD CONSTRAINT FK_MEMB_TO_MGR -- 회원 -> 매니저
		FOREIGN KEY (
			MRNO -- 매니저일련번호
		)
		REFERENCES MEMB ( -- 회원
			MNO -- 회원일련번호
		);

-- 학생
ALTER TABLE STUD
	ADD CONSTRAINT FK_MEMB_TO_STUD -- 회원 -> 학생
		FOREIGN KEY (
			SNO -- 학생일련번호
		)
		REFERENCES MEMB ( -- 회원
			MNO -- 회원일련번호
		);

-- 강의실사진
ALTER TABLE CROOM_PHOT
	ADD CONSTRAINT FK_CROOM_TO_CROOM_PHOT -- 강의실 -> 강의실사진
		FOREIGN KEY (
			CRMNO -- 강의실일련번호
		)
		REFERENCES CROOM ( -- 강의실
			CRMNO -- 강의실일련번호
		);

-- 강사사진
ALTER TABLE TCH_PHOT
	ADD CONSTRAINT FK_TCHER_TO_TCH_PHOT -- 강사 -> 강사사진
		FOREIGN KEY (
			TNO -- 강사일련번호
		)
		REFERENCES TCHER ( -- 강사
			TNO -- 강사일련번호
		);

-- 강사배정
ALTER TABLE TCHR_LECT
	ADD CONSTRAINT FK_TCHER_TO_TCHR_LECT -- 강사 -> 강사배정
		FOREIGN KEY (
			TNO -- 강사일련번호
		)
		REFERENCES TCHER ( -- 강사
			TNO -- 강사일련번호
		);

-- 강사배정
ALTER TABLE TCHR_LECT
	ADD CONSTRAINT FK_LECT_TO_TCHR_LECT -- 강의 -> 강사배정
		FOREIGN KEY (
			LNO -- 강의일련번호
		)
		REFERENCES LECT ( -- 강의
			LNO -- 강의일련번호
		);