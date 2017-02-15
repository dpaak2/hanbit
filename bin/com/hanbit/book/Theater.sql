DROP TABLE Consumer;
DROP TABLE Reservation;
DROP TABLE Theater;
DROP TABLE Multiplex;

CREATE SEQUENCE multi_seq 
START WITH 1000 INCREMENT
BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE res_seq 
START WITH 1000 INCREMENT
BY 1 NOCACHE NOCYCLE;

CREATE TABLE Multiplex(          --극장:Multiplex
	multi_seq DECIMAL NOT NULL,      --극장번호:multi_seq/decimal);
	multi_name VARCHAR2(20) NOT NULL, --극장이름:multi_name
	loc VARCHAR2(20) NOT NULL,
	PRIMARY KEY (multi_seq)
);

CREATE TABLE Theater(			
	multi_seq DECIMAL ,	    		 
	theater_no DECIMAL ,              
 	title VARCHAR2(20),	          
	price DECIMAL,	                 
	seat_count DECIMAL,  
	PRIMARY KEY(theater_no),
	FOREIGN KEY(multi_seq)REFERENCES Multiplex(multi_seq)
);	
--DROP TABLE Reservation;
CREATE TABLE Reservation(
	res_seq DECIMAL,
	multi_seq DECIMAL,
	theater_no DECIMAL, 
	con_no DECIMAL,
	seat_no VARCHAR2(5), 
	res_date VARCHAR2(10),	
	PRIMARY KEY (res_seq),
	FOREIGN KEY(multi_seq)REFERENCES Multiplex(multi_seq),
	FOREIGN KEY(theater_no)REFERENCES Theater(theater_no),
	FOREIGN KEY(con_no)REFERENCES Consumer(con_no)
);	
--ALTER TABLE Theater RENAME COLUMN theater_no TO theater_no;
--ALTER TABLE Reservation MODIFY seat_no VARCHAR2(10);
--ALTER TABLE Reservation ADD seat_no VARCHAR2(5);

--SELECT *FROM Reservation;
CREATE TABLE Consumer(	
	con_no DECIMAL,	--고객번호:con_no/decimal (랜덤숫자)
	name VARCHAR2(10),	
	addr VARCHAR2(20),
	PRIMARY KEY(con_no)
);	


INSERT INTO Multiplex(multi_seq,multi_name,loc)
VALUES(multi_seq.nextval,'롯데','잠실');
INSERT INTO Multiplex(multi_seq,multi_name,loc)
VALUES(multi_seq.nextval,'롯데','신촌');
select *from Multiplex;
INSERT INTO Theater(theater_no,multi_seq,title,price,seat_count )
VALUES(1,1000,'마스터',10000,100);
select *from Theater;
INSERT INTO Theater(theater_no,multi_seq,title,price,seat_count )
VALUES(2,1000,'로그원',12000,200);
select *from Theater;

INSERT INTO Consumer(con_no,name,addr)
VALUES(12345,'홍길동','서울');
INSERT INTO Consumer(con_no,name,addr)
VALUES(67890,'임꺽정','대치동');
select *from Consumer;

INSERT INTO Reservation(res_seq,res_date,multi_seq,theater_no,con_no,seat_no)
VALUES(res_seq.nextval,'2017-01-07',1000,1,12345,'F-10');
INSERT INTO Reservation(res_seq,res_date,multi_seq,theater_no,con_no,seat_no)
VALUES(res_seq.nextval,'2017-01-07',1000,1,67890,'F-11');
select*from Reservation;

CREATE VIEW Reservation_View
AS
SELECT 
	m.multi_seq multi_seq,
	m.multi_name multi_name,
	m.loc loc,
	t.theater_no theater_no,
	t.title title,
	t.price price,
	t.seat_count seat_count,
	r.res_seq res_seq,
	r.multi_seq multi_seq,
	r.theater_no theater_no,
	r.con_no con_no,
	r.seat_no seat_no,
	r.res_date res_date,
	c.con_no con_no,
	c.name name,
	c.addr addr
FROM Reservation r, 
full outer join Multiplex m  on r.multi_seq=m.multi_seq
full outer join Theater t on r.theater_no=t.theater_no
full outer join Consumer c on c.con_no=r.con_no
 ;
 
 select *from Reservation_View