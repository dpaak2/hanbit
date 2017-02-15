CREATE TABLE Subject(
	scode VARCHAR2(20),
	sname VARCHAR2(20) NOT NULL,
	PRIMARY KEY (scode)
);
CREATE TABLE Student(
	name VARCHAR2(15) NOT NULL, 
	sno VARCHAR2(15) NOT NULL,  
	scode VARCHAR2(20),         
	gender VARCHAR2(1) NOT NULL,
	birth DECIMAL, 				
	PRIMARY KEY (sno), 			
	FOREIGN KEY (scode)REFERENCES Subject(scode)
);
SELECT*FROM Subject;
SELECT*FROM Student;
