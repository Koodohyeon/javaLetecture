##########################
# 테이블 조인(Table join)
##########################

/* 
 * 1. 테이블 생성
 */
 # song TABLE
 CREATE TABLE if NOT EXISTS song (
    SID INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(32) not null,
    LYRICS VARCHAR(64), 
 ) AUTO_INCREMENT=101;      #시작 번호 지정

 #girl_group TABLE
 create table if not exists girl_group (
    gid int primary key auto_increment,
    name varchar(32) not null,
    debut date not null,
    hit_song_id int
 ) auto_increment=1001;

 /*
  * 2. 데이터 입력
  */
# song table 
Insert into song (title, lyrics) VALUES
('Tell Me', 'tell me tell me tetetete tel me'),
   ('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
   ('미스터', '이름이 뭐야 미스터'), 
   ('Abracadabra', '이러다 미쳐 내가 여리여리'),
   ('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
   ('I Dont care', '다른 여자들의 다리를'), 
   ('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
   ('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
   ('A', 'A 워오우 워오우워 우우우'),
   ('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요 '),
   ('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
   ('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');

# girl_group table
Insert into girl_group ( name, debut, hit_song_id) values
    ('원더걸스', '2007-02-10', 101),
   ('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
   ('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
   ('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
   ('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
   ('애프터 스쿨', '2009-11-25', 120), ('포미닛', '2009-08-28', 121);

/*
 * 3. table join
 */
# inner join
 select r.name,r.debut, l.title, l.lyrics from song l
    inner join girl_group r             # inner 생략가능
    on l.sid=r.hit_song_id;

# Left outer join
select r.name,r.debut, l.title, l.lyrics from song l
    left outer join girl_group r        # outer 생략가능
    on l.sid=r.hit_song_id;

# right outer join
select r.name,r.debut, l.title, l.lyrics from song l
    right outer join girl_group r        # outer 생략가능 /* 먼저 쓴게 left 나중dl right */
    on l.sid=r.hit_song_id;

# full outer join- MYSQL 에서는 left와 right를 union
select r.name,r.debut, l.title, l.lyrics from song l
    left outer join girl_group r        
    on l.sid=r.hit_song_id
union
select r.name,r.debut, l.title, l.lyrics from song l
    right outer join girl_group r        
    on l.sid=r.hit_song_id;
