# Java-Login_Text_a_housekeeping_book
 
# DB 구조
cashdiary 테이블 CREATE TABLE cashdiary ( year varchar(50) not null, --년
month varchar(50) not null, --월
time varchar(50) not null, --시간
day varchar(50) not null, --일
item varchar(50) not null, --아이템
cost varchar(50) not null, --가격
memo varchar(50) not null, --메모
CONSTRAINT PLAYER_PK PRIMARY KEY (year) --기본기
);
