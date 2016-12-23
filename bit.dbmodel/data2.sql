-- 게시판 데이터
insert into content(cono,mno,rdt,vw_cnt) values(1,1,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(2,1,now(),7);
insert into content(cono,mno,rdt,vw_cnt) values(3,2,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(4,2,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(5,2,now(),12);
insert into content(cono,mno,rdt,vw_cnt) values(6,3,now(),35);
insert into content(cono,mno,rdt,vw_cnt) values(7,6,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(8,7,now(),1);
insert into content(cono,mno,rdt,vw_cnt) values(9,8,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(10,21,now(),0);

insert into board(bdno,titl,conts) values(1,'제목1','내용1');
insert into board(bdno,titl,conts) values(2,'제목1','내용1');
insert into board(bdno,titl,conts) values(3,'제목1','내용1');
insert into board(bdno,titl,conts) values(4,'제목1','내용1');
insert into board(bdno,titl,conts) values(5,'제목1','내용1');
insert into board(bdno,titl,conts) values(6,'제목1','내용1');
insert into board(bdno,titl,conts) values(7,'제목1','내용1');
insert into board(bdno,titl,conts) values(8,'제목1','내용1');
insert into board(bdno,titl,conts) values(9,'제목1','내용1');
insert into board(bdno,titl,conts) values(10,'제목1','내용1');

-- 프로젝트 데이터
insert into content(cono,mno,rdt,vw_cnt) values(11,1,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(12,1,now(),7);
insert into content(cono,mno,rdt,vw_cnt) values(13,2,now(),0);

insert into proj(pjno,titl,conts,sdt,edt) values(11,'프로젝트1','내용1','2016-10-01','2016-12-30');
insert into proj(pjno,titl,conts,sdt,edt) values(12,'프로젝트2','내용2','2016-11-01','2017-02-20');
insert into proj(pjno,titl,conts,sdt,edt) values(13,'프로젝트3','내용3','2016-12-01','2017-03-30');
 
-- 할 일 데이터
insert into content(cono,mno,rdt,vw_cnt) values(14,1,now(),0);
insert into content(cono,mno,rdt,vw_cnt) values(15,1,now(),7);
insert into content(cono,mno,rdt,vw_cnt) values(16,2,now(),0);

insert into todo(tdno, seq, conts, mno) values(14, 1, '할일1', 8);
insert into todo(tdno, seq, conts, mno) values(15, 2, '할일1', 8);
insert into todo(tdno, seq, conts, mno) values(16, 1, '할일1', 9);


-- 팔로잉 데이터
insert into follow(fowr_no, fwng_no) values(1, 5);
insert into follow(fowr_no, fwng_no) values(5, 1);
insert into follow(fowr_no, fwng_no) values(1, 7);
insert into follow(fowr_no, fwng_no) values(1, 21);
insert into follow(fowr_no, fwng_no) values(1, 22);
insert into follow(fowr_no, fwng_no) values(1, 32);
insert into follow(fowr_no, fwng_no) values(32, 1);
insert into follow(fowr_no, fwng_no) values(32, 21);















