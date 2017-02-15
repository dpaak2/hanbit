DROP TABLE Charts;
DROP TABLE Treatment;
DROP TABLE Patients;
DROP TABLE Nurses;
DROP TABLE Doctors;

CREATE TABLE Doctors(
	doc_id VARCHAR2(6) NOT NULL,
	major_treat VARCHAR2(25)NOT NULL,
	doc_name VARCHAR2(20)NOT NULL,
	doc_gen CHAR(1)NOT NULL,
	doc_phone VARCHAR2(15),
	doc_email VARCHAR2(50),
	doc_position VARCHAR2(20),
	PRIMARY KEY(doc_id)
);
CREATE TABLE Nurses( 
nur_id VARCHAR2(6) NOT NULL,
major_job VARCHAR2(25) NOT NULL,
nur_name VARCHAR2(20) NOT NULL,
nur_gen VARCHAR2(1)NOT NULL,
nur_phone VARCHAR2(15) NULL,
nur_email VARCHAR2(50) NULL,
nur_position VARCHAR2(20) NOT NULL,
PRIMARY KEY(nur_id)
);
CREATE TABLE Patients(
pat_id VARCHAR2(6) NOT NULL,
nur_id VARCHAR2(6) NOT NULL,
doc_id VARCHAR2(6) NOT NULL,
pat_name VARCHAR2(20) NOT NULL,
pat_gen VARCHAR2(1) NOT NULL,
pat_jumin VARCHAR2(14) NOT NULL,
pat_addr VARCHAR2(100) NOT NULL,
pat_phone VARCHAR2(15) NULL,
pat_email VARCHAR2(50) NULL,
pat_job VARCHAR2(20) NOT NULL,
PRIMARY KEY(pat_id),
FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id),
FOREIGN KEY(nur_id) REFERENCES Nurses(nur_id)
);
CREATE TABLE Treatment(
treat_id VARCHAR2(10) NOT NULL,
Pat_id VARCHAR2(6) NOT NULL,
doc_id VARCHAR2(6) NOT NULL,
treat_contents VARCHAR2(1000) NOT NULL,
treat_date DECIMAL NOT NULL,
PRIMARY KEY(treat_id),
FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id),
FOREIGN KEY(Pat_id) REFERENCES Patients(Pat_id)
);
CREATE TABLE Charts(
	chart_id VARCHAR2(20) NOT NULL,
	treat_id VARCHAR2(10) NOT NULL,
	doc_id VARCHAR2(6) NOT NULL,
	pat_id VARCHAR2(6) NOT NULL,
	nur_id VARCHAR2(6) NOT NULL,
	chart_contents VARCHAR2(1000) NOT NULL,
	PRIMARY KEY(chart_id),
	FOREIGN KEY(Pat_id) REFERENCES Patients(Pat_id),
	FOREIGN KEY(treat_id) REFERENCES Treatment(treat_id),
	FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id),
	FOREIGN KEY(nur_id) REFERENCES Nurses (nur_id)
);

INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('98012','소아과','이태정','M','010-333-1340','ltj@hanbh.com','과장');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('000601','내과','안성기','M','011-222-0987','ask@hanbh.com','과장');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('001208','외과','김민종','M','010-333-8743','kmj@hanbh.com','과장');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('020403','피부과','이태서','M','019-777-3764','lts@hanbh.com','과장');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('050900','소아과','김연아','F','010-555-3746','kya@hanbh.com','전문의');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('050101','내과','차태현','M','011-222-7643','cth@hanbh.com','전문의');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('062019','소아과','전지현','F','010-999-1265','JJH@HANBH.COM','전문의');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('070576','피부과','홍길동','M','016-333-7263','hgd@hanbh.com','전문의');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('080543','방사선과','유재석','M','010-222-1263','yjs@hanbh.com','과장');
INSERT INTO Doctors (doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES('091001','외과','김병만','M','010-555-3542','kbm@hanbh.com','전문의');

--SELECT*FROM Doctors;

INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('050302','소아과','김은영','F','010-555-8751','key@hanbh.com','수간호사');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('050021','내과','윤성애','F','016-333-8745','ysa@hanbh.com','수간호사');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('040089','피부과','신지원','M','010-666-7646','sjw@hanbh.com','주임');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('070605','방사선과','유정화','F','010-333-4588','yjh@hanbh.com','주임');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('070804','내과','라하나','F','010-222-1340','nhn@hanbh.com','주임');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('071018','소아과','김화경','F','019-888-4116','khk@hanbh.com','주임');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('100356','소아과','이선용','M','010-777-1234','lsy@hanbh.com','간호사');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('104145','외과','김현','M','010-999-8520','kh@hanbh.com','간호사');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('120309','피부과','박성완','M','010-777-4996','psw@hanbh.com','간호사');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES('130211','외과','이서연','F','010-222-3214','lsy@hanbh.com','간호사');
select *from NURSES;

INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES('2345','050302','980312','안상건','M','232345','서울',010-555-7845,'ask@ab.com','회사원');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES('3545','040089','0204030','김성','M','543545','서울','010-333-7812','ksr@bb.com','자영업');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES('3424','070605','080543','이종진','M','4333424','부산','019-888-4859','ljj@ab.com','회사원');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('7675','100356','050900','최광석','M','677675','당진','010-222-4847','cks@cc.com','회사원');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('4533','070804','000601','정한경','M','744533','강릉','010-777-9630','jhk@ab.com','교수');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('5546','120309','070576','유원현','M','765546','대구','016-777-0214','ywh@cc.com','자영업');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('4543','070804','050101','최재정','M','454543','부산','010-555-4187','cjj@bb.com','회사원');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('9768','130211','091001','이진희','F','119768','서울','010-888-3675','lih@ab.com','교수');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('4234','130211','091001','오나미','F','234234','속초','010-999-6541','onm@cc.com','학생');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES ('7643','071018','062019','송성묵','M','987643','서울','010-222-5874','ssm@bb.com','학생');
--SELECT*from PATIENTS;

INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('130516023', '2345', '980312', '감기, 몸살', 20130516);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('130628100', '3545', '020403', '피부 트러블 치료', 20130628);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('131205056', '3424', '080543', '목 디스크로 MRI 촬영', 20131205);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('131218024','7675','050900', '중이염', 20131218);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('131224012', '4533', '000601', '장염', 20131224);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('140103001', '5546', '070576', '여드름 치료', 20140103);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('140109026', '4543', '050101', '위염', 20140109);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('140226102', '9768', '091001', '화상치료', 20140226);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('140303003', '4234', '091001', '교통사고 외상치료', 20140303);
INSERT INTO Treatment (treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES ('140308087', '7643', '062019', '장염', 20140308);
--SELECT * FROM Treatment;

INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('p_130516023', '130516023', '980312', '2345', '050302', '감기 주사 및 약 처방' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('d_130628100', '130628100', '020403', '3545', '040089', '피부 감염 방지 주사' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('r_131205056', '131205056', '080543', '3424', '070605', '주사 처방' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('p_131218024', '131218024', '050900', '7675', '100356', '귓속청소 및 약 처방' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('i_131224012', '131224012', '000601',' 4533', '070804', '장염 입원치료' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('d_140103001', '140103001', '070576', '5546', '120309', '여드림 치료약 처방' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('i_140109026', '140109026', '050101', '4543', '070804', '위내시경' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('s_140226102', '140226102', '091001', '9768', '130211', '화상 크림약 처방' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('s_140303003', '140303003', '091001', '4234', '130211', '입원치료' );
INSERT INTO Charts (chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('p_140308087', '140308087', '062019', '7643', '071018', '장염 입원치료' );
--SELECT * FROM Charts;

